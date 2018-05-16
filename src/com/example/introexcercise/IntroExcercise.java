package com.example.introexcercise;

public class IntroExcercise {
    public static void main(String[] args) {
       eassiestExercise();
       horizontaLine(8);
       System.out.println("");
       verticaLine(3);
       righTriangle(3);
    }
    public static void eassiestExercise() {
        System.out.println("*");
    }
    public static void horizontaLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
    public static void verticaLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }
    public static void righTriangle(int n) {
        for (int i = 0; i < n; i++) {
            String line = "";
            for (int j = 0; j <= i; j++) {
                line += "*";
            }
            System.out.println(line);
        }
    }
}
