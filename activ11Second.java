package com.company;

import java.util.ArrayList;
import java.util.Scanner;



public class activ11Second {
    public static void main(String[] args) {

        int max = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        int k;
        Scanner input = new Scanner(System.in);
        do{k= input.nextInt();
            arrayList.add(k);
        }
        while(k!=0);
        int[] numbers = new int[arrayList.size()];
        int[] truemeanOfnumbers = new int[arrayList.size()];

        for(int i = 0;i< arrayList.size();i++){

            for(int z = 0;z< arrayList.size();z++){
                if(arrayList.get(i)==arrayList.get(z)){
                    numbers[i]++;
                    truemeanOfnumbers[i]=arrayList.get(i);
                }
            }
        }
        //find biggest
        for(int i = 0;i< arrayList.size();i++){
            for(int z = 0;z< arrayList.size();z++){
                max = numbers[0];
                if(numbers[i]<numbers[z]){
                    max = numbers[z];

                }
            }

        }
        int[] control_povtors = new int[arrayList.size()];

        for(int z = 0;z< arrayList.size();z++){
            for(int l = 0;l< arrayList.size();l++){
                boolean kruk =true;
                for(int f = 0;f< arrayList.size();f++){
                    if(control_povtors[f]==truemeanOfnumbers[z]){
                        kruk=false;
                    }
                }




            if(numbers[z]==max&&kruk!=false) {
                control_povtors[z]=truemeanOfnumbers[z];
                System.out.println(truemeanOfnumbers[z]);
            }
            }
        }



    }

}
