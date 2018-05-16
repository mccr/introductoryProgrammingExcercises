package com.example.primefactors;

import java.util.ArrayList;

public class PrimeFactors {
    public static void main(String[] args) {
        generate(1);
        generate(30);
    }
    public static void generate(int n) {
        int number = n;
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= number / i ; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        if (n > 1) {
           factors.add(number);
        }
        System.out.println(factors);
    }
}
