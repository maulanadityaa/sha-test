package com.enigma;

public class Roger {
    public static void main(String[] args) {
        System.out.println(roger(8,8));
    }

    public static int roger(int k, int b){
        if(b == 1) return 1;
        else if(k % b == 0) return 1 + roger(k, --b);
        else return 0 + roger(k, --b);
    }
}
