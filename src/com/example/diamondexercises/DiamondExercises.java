package com.example.diamondexercises;

public class DiamondExercises {
    public static void main(String[] args) {
        isoscelesTriangle(3);
        diamond(3);
        diamondWithName(3);
    }
    public static void isoscelesTriangle(int n) {
        prinTopTriangle(n);
    }
    public static void diamond(int n) {
        prinTopTriangle(n);
        printBottomTriangle(n);
    }
    public static void diamondWithName(int n) {
        int spaceNumber = n - 1;
        int starNumber = 1;
        for (int i = 1; i <= n ; i++) {
            if (i == n) {
                System.out.print("Monica");
            } else {
                printChar(spaceNumber, " ");
                printChar(starNumber, "*");
            }
            spaceNumber -= 1;
            starNumber += 2;
            System.out.print("\n");
        }
        printBottomTriangle(n);
    }

    public static void prinTopTriangle(int rows) {
        int spaceNumber = rows - 1;
        int starNumber = 1;
        for (int i = 0; i < rows ; i++) {
            printChar(spaceNumber, " ");
            printChar(starNumber, "*");
            spaceNumber -= 1;
            starNumber += 2;
            System.out.print("\n");
        }
    }

    public static void printBottomTriangle(int rows) {
        int spaceNumber = 1;
        int starNumber = 1 + (rows - 2) * 2;
        for (int i = 0; i < rows - 1; i++) {
            printChar(spaceNumber, " ");
            printChar(starNumber, "*");
            spaceNumber += 1;
            starNumber -= 2;
            System.out.print("\n");
        }
    }
    public static void printChar(int times, String character) {
        String linePrint = "";
        for (int i = 0; i < times; i++) {
            linePrint += character;
        }
        System.out.print(linePrint);
    }
}
