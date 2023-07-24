package com.morarj;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Limite: ");

        int num = scanner.nextInt();

        declarativa(num);
        imperativa(num);
    }

    public static void declarativa(int limite) {
        for (int i = 1; i <= limite; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void imperativa(int limite) {
        // Stream de enteros con un rango de 1 al limite
        // Regresa un objeto en base al objeto iterado. En este caso se itera sobre los enteros y se regresa una cadena
        // Al final se imprime
        IntStream.rangeClosed(1, limite)
                .mapToObj(i -> i % 5 == 0 && i % 7 == 0 ? "FizzBuzz" :
                        i % 5 == 0 ? "Fizz" :
                                i % 7 == 0 ? "Buzz" :
                                        String.valueOf(i))
                .forEach(System.out::println);
    }
}
