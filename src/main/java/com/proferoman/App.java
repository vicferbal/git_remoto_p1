package com.proferoman;

public class App {
    public static void main(String[] args) {
        System.out.println("Estos son los argumentos que has pasado:");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
