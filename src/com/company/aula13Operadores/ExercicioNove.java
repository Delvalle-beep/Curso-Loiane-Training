package com.company.aula13Operadores;

import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite aqui a temperatura em Farenheit:");
        double tempFarenheit = scan.nextDouble();
        System.out.println("A conversão em célcius é:");
        System.out.println(5*(tempFarenheit-32)/9 + "ºC");
    }
}
