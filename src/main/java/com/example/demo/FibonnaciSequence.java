package com.example.demo;
import java.util.Collections;
import java.util.ArrayList;

public class FibonnaciSequence {
    public int[] fibonnaciScanner(int input_number){
        Integer n = 5;
        int[] fibonnaci=new int[20];
        fibonnaci[n-1]=input_number;
        fibonnaci[n-2]=input_number-1;
        fibonnaci[n-3]=input_number-2;
        fibonnaci[n-4]=input_number-3;
        fibonnaci[n-5]=input_number-4;
        while (fibonnaci[n] <=10000 & n<19) {
            fibonnaci[n] = fibonnaci[n - 1] + fibonnaci[n - 2] + fibonnaci[n - 3] + fibonnaci[n - 4];
            n= n + 1;
        }
        return fibonnaci;
    }
}
