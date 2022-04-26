package com.company;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class Activ11 {

        public static void main(String[] args) {

                String[] array1 = new String[]{"George", "Jim", "John", "Blake", "Kevin","Michael"};
                String[] array2 = new String[]{"George","Katie","Kevin","Michelle", "Ryan"};

                LinkedHashSet<String> sett01 = new LinkedHashSet<>(Arrays.asList(array1));
                LinkedHashSet<String> sett02 = new LinkedHashSet<>(Arrays.asList(array2));
                System.out.println("Set 1" + sett01);
                System.out.println("Set 2" + sett02 );
                System.out.println(" ");


                LinkedHashSet<String> unionSet = (LinkedHashSet<String>)sett01.clone();
                unionSet.addAll(sett02);
                System.out.println("Union is " + unionSet );
                System.out.println(" ");

                LinkedHashSet<String> intersection = (LinkedHashSet<String>) sett01.clone();
                intersection.retainAll(sett02);
                System.out.println("Intersection " + intersection );
                System.out.println(" ");


                HashSet<String> difference = (LinkedHashSet<String>) sett01.clone();
                HashSet<String> dif2Set = (LinkedHashSet<String>) sett02.clone();
                difference.removeAll(sett02);
                dif2Set.removeAll(sett01);
                difference.addAll(dif2Set);
                System.out.println("Difference " + difference );
                System.out.println(" ");





        }
}