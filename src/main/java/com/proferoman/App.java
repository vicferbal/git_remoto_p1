package com.proferoman;

public class App {
    public static void main(String[] args) {
        System.out.println("Argumentos pasados al programa:");
        for (int i = 1; i <= args.length; i++) {
            System.out.println("Argumento " + i + ": " + args[i]);
        }

        System.out.println("Fin del programa.");
    }
}
