package com.morarj;

import java.util.Scanner;

public class InvertirPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Palabra: ");

        String palabra = scanner.next();

        declarativa(palabra);
        imperativa(palabra);

    }

    public static void declarativa(String palabra) {
        String palabraInvertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
        }

        System.out.println(palabraInvertida);
    }

    public static void imperativa(String palabra) {
        String palabraInvertida = "";

        // Se convierte la palabra a un intstream de caracteres
        // Se convierte cada char a String
        // Reduce empieza con una cadena vacia y se le va concatenando el ultimo mas el primero
        palabraInvertida = palabra.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .reduce("", (s1, s2) -> s2 + s1);

        System.out.println(palabraInvertida);

    }
}
