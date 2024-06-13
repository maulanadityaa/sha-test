package com.enigma;

public class LetterCounter {
    static String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    static String SYMBOL = "!@#$%^&*()-+";
    static String NUMBER = "0123456789";

    public static void main(String[] args) {
        countLetter("pemrogramanDasarJava1");
    }

    public static void countLetter(String text) {
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countSymbol = 0;
        int countNumber = 0;

        String[] cleanedText = text.replaceAll("\\s", "").split("");

        for (String word : cleanedText) {
            if (UPPERCASE.contains(word)) {
                countUpperCase++;
            } else if (LOWERCASE.contains(word)) {
                countLowerCase++;
            } else if (SYMBOL.contains(word)) {
                countSymbol++;
            } else if (NUMBER.contains(word)) {
                countNumber++;
            }
        }

        System.out.println("uppercase: " + countUpperCase +
                "\nlowercase: " + countLowerCase +
                "\nangka: " + countNumber +
                "\nsymbol: " + countSymbol);
    }
}
