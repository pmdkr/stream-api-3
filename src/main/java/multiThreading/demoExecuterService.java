package multiThreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demoExecuterService {

    public static void main(String[] args){
        ExecutorService executerService= Executors.newFixedThreadPool(4);


        executerService.submit(()->{
            System.out.println("print from thread"+Thread.currentThread().getName());
        });
        executerService.submit(()->{
            System.out.println("print from thread"+Thread.currentThread().getName());
        });
        executerService.submit(()->{
            System.out.println("print from thread"+Thread.currentThread().getName());
        });
        executerService.submit(()->{
            System.out.println("print from thread"+Thread.currentThread().getName());
        });


        executerService.shutdown();
    }
}
