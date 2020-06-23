package com.company.aula13Operadores;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio para saber a área do círculo:");
        int raio = scan.nextInt();
        System.out.println("A área do círculo é:");
        System.out.println(3.14*raio*raio);
    }
}
