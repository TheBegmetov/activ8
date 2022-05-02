package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Activ_13 {
    private static Integer integer = 0;
    public static void main(String[] args) {


        ExecutorService executor = Executors.newCachedThreadPool();








        for (int i = 0; i < 1000; i++) {
            executor.execute(new AddOne());
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
        }

        System.out.println("sum = " +integer );
    }


    private static class AddOne implements Runnable {
        public void run() {
            integer++;
        }
    }
}
