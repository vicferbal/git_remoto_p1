package com.proferoman;

public class App {
    public static void main(String[] args) {

        //primera forma
        System.out.println("Estos son los argumentos que has pasado:");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        //segunda forma
        System.out.println("Argumentos pasados al programa:");
        for (int i = 1; i <= args.length; i++) {
            System.out.println("Argumento " + i + ": " + args[i]);

        }

        //tercera forma

        System.out.println("Listado de argumentos pasados al programa:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumento: " + (i + 1) + ": " + args[i]);
        }

        System.out.println("Fin del programa. Hasta pronto.");

    }
}
