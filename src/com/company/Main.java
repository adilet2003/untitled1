package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
        System.out.println();
        names[0] = "Jack";
        names[1] = "Bill";
        names[2] = "John";



            for (int i = 0; i < names.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("Доброе утро" + " " + names[0]);
                    break;
                case 1:
                    System.out.println(" добрый день" + " " + names[1]);
                    break;
                case 2:
                    System.out.println("добрый вечер" + " " + names[2]);
            }
        }
    }
}
