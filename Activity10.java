package com.company;

import java.util.ArrayList;

import java.io.*;
import java.util.PriorityQueue;


public class Activity10 {

    public static void main(String[] args) throws Exception {



        File file = new File("C:\\Users\\User\\IdeaProjects\\wind\\cs.txt");



        PriorityQueue<String> pQueue = new PriorityQueue<>(1000);

        try (BufferedReader in = new BufferedReader(new FileReader(file))) {

            String s;
            while ((s = in.readLine()) != null) {

                String[] words = getSplit(s);
                for (String word : words) {
                    pQueue.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        }

        while (pQueue.size() > 0) {
            System.out.println(pQueue.poll() );
        }

    }

    public static String[] getSplit(String s) {

        return s.split("");
    }

}
