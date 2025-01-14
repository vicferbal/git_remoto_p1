package com.proferoman;

public class App {
    public static void main(String[] args) {
        System.out.println("Listado de argumentos pasados al programa:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumento: " + (i + 1) + ": " + args[i]);
        }

        System.out.println("Fin del programa. Hasta pronto.");
    }
}
