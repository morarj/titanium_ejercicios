package com.morarj;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Num: ");

        int num = scanner.nextInt();

        declarativa(num);
        imperativa(num);

    }

    public static void declarativa(int num) {
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }

    public static void imperativa(int num) {
        // Stream de enteros con un rango de 1 al limite
        // Reduce empieza desde 1 y va acumulando la multiplicación (1, (1,2) -> 1*2), (2, (2,3) -> 2*3), (6, (6,4) -> 6*4)
        // Al final se imprime el resultado
        int factorial = IntStream.rangeClosed(1, num)
                .reduce(1, (int x, int y) -> x * y);

        System.out.println(factorial);
    }
}
