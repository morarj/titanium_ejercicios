package com.morarj;

import java.util.Scanner;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Limite: ");

        int limit = scanner.nextInt();

        // Array original de 2 posiciones como semilla
        // El nuevo array consta del 2do valor y el 1er valor mas el 2do valor
        // Dado que el stream es infinito se le agrega un limite
        // Al final se imprime el primer valor del array creado
        Stream.iterate(new Integer[] {0,1}, s -> new Integer[]{s[1], s[0] + s[1]})
                .limit(limit)
                .map(s -> s[0])
                .forEach(System.out::println); // consume the mapped element
    }
}