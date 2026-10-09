package multiThreading;

import java.util.Objects;

public class PrintLetterNumber {


    private static Object lock = new Object();
    private static boolean isPrintLetter = true;

    static void main() {
        //create two runnable object and start two thread

        //A1B2C3D4..............Z26
//
//        Runnable printLetter= new Runnable(){
//            @Override
//           public void run(){
//                for(char ch='A';ch<='Z';ch++){
//                    System.out.print(ch+" ");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        };
//
//
//        Runnable printNumber= new Runnable(){
//            @Override
//            public void run(){
//                for(int i=1;i<27;i++){
//
//                    System.out.print(i+" ");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        };
//
//
//
//        Thread t1= new Thread(printLetter);
//        Thread t2 = new Thread(printNumber);
//
//        t1.start();
//        t2.start();
//
//        try{
//            t1.join();
//            t2.join();
//        }catch (InterruptedException e){
//
//        }


        // using lock object and a flag


        Thread t1 = new Thread(() -> {
            for (char ch = 'A'; ch <= 'Z'; ch++) {

                synchronized (lock) {
                    if (!isPrintLetter) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.print(ch + " ");
                    isPrintLetter = false;
                    lock.notify();
                }
            }
        });


        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 26; i++) {
                synchronized (lock) {
                    if (isPrintLetter) {
                        try {
                            lock.wait();
                        } catch (InterruptedException ex) {
                            throw new RuntimeException();
                        }
                    }

                    System.out.print(i + " ");
                    lock.notify();
                    isPrintLetter = true;
                }
            }
        });


        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();

        } catch (InterruptedException ex) {
            throw new RuntimeException();
        }

        System.out.println("\n");

        System.out.println("main method is completed successfully");
    }
}
