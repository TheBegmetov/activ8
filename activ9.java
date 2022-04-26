package com.company;

public class activ9 {

    public static void main(String[] args) {
        Integer[] list = new Integer[30];
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
        System.out.println(linSearching(list, 1));
        System.out.println(linSearching(list, 10));
        System.out.println(linSearching(list, 50));
    }

    public static <E extends Comparable<E>> int linSearching(E[] list, E value) {

        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(value) == 0) {
                return i;
            }
        }

        return -1;
    }

}
