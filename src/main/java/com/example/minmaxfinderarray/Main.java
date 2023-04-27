package com.example.minmaxfinderarray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* int [] list = {1,6,3,8,6};
        int min = list[0];
        int max = list[0];

        for (int small : list){
            if(small < min){
                min = small;
            }
        }
        for (int big : list){
            if (big > max){
                max = big;
            }
        }
        System.out.println( "Max nmumber is : " + max);
        System.out.println("Min number is : " + min);*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number : ");
        int input = scanner.nextInt();


        int[] list = { 1,6,9,3,5};
        Arrays.sort(list);

       int inputMin = list[0];
       int inputMax = list[list.length-1];

       for (int min : list){
           if (min < input){
               inputMin = min ;
               }
           }
       for (int max : list){
           if(max > input){
               inputMax = max;
               break;
       }
       }

        System.out.println("max : " + inputMax);
        System.out.println("min : " + inputMin);






    }
}
