package com.samuelleitee;

import java.util.Scanner;

public class Main {

    private final static String WELLCOME_MESSAGE = "Olá, informe o seu nome:";

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(WELLCOME_MESSAGE);
        String name = scanner.next();

        System.out.println("Informe a sua idade:");
        int age = scanner.nextInt();

        System.out.println("Olá, " + name + ", sua idade é " + age + ".");
        System.out.printf("Olá, %s, sua idade é %s", name, age);
    }
}