package com.example.demo;
import java.util.Collections;
import java.util.ArrayList;

public class FibonnaciSequence {
    ArrayList<Integer> fibonnaci = new ArrayList<>();
    public ArrayList<Integer> fibonnaciScanner(Integer input_number){
        Integer n=4;
        fibonnaci.add(input_number-3);
        fibonnaci.add(input_number-2);
        fibonnaci.add(input_number-1);
        fibonnaci.add(input_number-0);
        /*
        while (fibonnaci.get(n) <100000){
            fibonnaci.add(fibonnaci.get(n-1)+fibonnaci.get(n-2)+fibonnaci.get(n-3)
                    +fibonnaci.get(n-4));

        }*/

        /*
        int[] fibonnaci=new int[20];
        fibonnaci[n-1]=input_number;
        fibonnaci[n-2]=input_number-1;
        fibonnaci[n-3]=input_number-2;
        fibonnaci[n-4]=input_number-3;
        fibonnaci[n-5]=input_number-4;
        while (fibonnaci[n] <=10000 & n<19) {
            fibonnaci[n] = fibonnaci[n - 1] + fibonnaci[n - 2] + fibonnaci[n - 3] + fibonnaci[n - 4];
            n= n + 1;
        }*/
        return fibonnaci;
    }
}
