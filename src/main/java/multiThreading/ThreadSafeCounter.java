package multiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSafeCounter {

    //print thread safe counter , like increment and decrement operation on shard variable

    //static private int count = 0; //  race conditin - read, modify, write
    static private AtomicInteger counter = new AtomicInteger(0);

    static void main() {
        // create two thread and run them
        Thread incrementNumber = new Thread(() -> {

            for (int i = 0; i < 100000; i++) {
                counter.incrementAndGet();
            }
        });

        Thread decrementNumber = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                counter.decrementAndGet();
            }

        });


        incrementNumber.start();
        decrementNumber.start();

        try {
            incrementNumber.join();
            decrementNumber.join();
        } catch (InterruptedException ex) {
            throw new RuntimeException();
        }

        System.out.println("count final value : " + counter);
    }
}
