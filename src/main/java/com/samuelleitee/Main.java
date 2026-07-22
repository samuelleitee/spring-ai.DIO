package com.samuelleitee;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o 1° número: ");
        int value1 = scanner.nextInt();

        System.out.println("Informe o 2° número: ");
        int value2 = scanner.nextInt();

        System.out.println(value1 + " + " + value2 + " = " + (value1 + value2));
        System.out.printf("%s + %s = %s", value1, value2, value1 + value2);

        /*
         * Operadores Aritméticos em Java
         *
         * +  -> Adição
         * -  -> Subtração
         * *  -> Multiplicação
         * /  -> Divisão
         * %  -> Módulo (resto da divisão)
         *
         * Exemplos:
         * int a = 10;
         * int b = 3;
         *
         * a + b  // 13
         * a - b  // 7
         * a * b  // 30
         * a / b  // 3  (divisão inteira)
         * a % b  // 1  (resto da divisão)
         *
         * Incremento e Decremento:
         * ++a  // Pré-incremento: incrementa antes de usar
         * a++  // Pós-incremento: usa o valor e depois incrementa
         * --a  // Pré-decremento
         * a--  // Pós-decremento
         */
    }
}