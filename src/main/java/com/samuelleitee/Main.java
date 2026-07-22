package com.samuelleitee;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto é 2 + 2?");
        int result = scanner.nextInt();

        System.out.printf("O resultado é 4, você acertou? (%s)", result == 2);

        System.out.println("\n----------");

        System.out.println("Quantos anos você tem?");
        int age = scanner.nextInt();

        System.out.println("Você é emancipado?");
        boolean emancipated = scanner.nextBoolean();

        System.out.printf("Você pode dirigir? (%s)", age >= 18 || emancipated && age >= 16);


        /*
         * Operadores em Java
         *
         * Operadores Aritméticos:
         * +  -> adição
         * -  -> subtração
         * *  -> multiplicação
         * /  -> divisão
         * %  -> resto da divisão (módulo)
         *
         * Operadores Relacionais:
         * == -> igual a
         * != -> diferente de
         * >  -> maior que
         * <  -> menor que
         * >= -> maior ou igual a
         * <= -> menor ou igual a
         *
         * Operadores Lógicos:
         * && -> E (AND): verdadeiro se ambas as condições forem verdadeiras
         * || -> OU (OR): verdadeiro se pelo menos uma condição for verdadeira
         * !  -> NÃO (NOT): inverte o valor lógico
         *
         * Operadores de Atribuição:
         * =   -> atribuição
         * +=  -> soma e atribui
         * -=  -> subtrai e atribui
         * *=  -> multiplica e atribui
         * /=  -> divide e atribui
         * %=  -> resto da divisão e atribui
         *
         * Operadores de Incremento/Decremento:
         * ++ -> incrementa 1
         * -- -> decrementa 1
         */
    }
}