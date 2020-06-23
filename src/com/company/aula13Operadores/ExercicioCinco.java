package com.company.aula13Operadores;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor em metros:");
        int numeroMetro = scan.nextInt();
        System.out.println("O valor da medida em centimetros é:");
        System.out.println(numeroMetro*100);
    }
}
