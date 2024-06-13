package com.enigma;

public class Rusak {
    static int counter = 0;

    public static void main(String[] args) {
        rusak(1000);
    }

    public static void rusak(int n){
        if (n == 0) {
            return;
        }

        for (int i=0; i<n; i++) {
            System.out.println("Hello");
            System.out.println(++counter);;
        }

        rusak((int) n/2);
    }
}
