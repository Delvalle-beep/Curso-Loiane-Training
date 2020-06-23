package com.company.aula13Operadores;

import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em Célcius para obter em Farenheit:");
        double tempCelcius = scan.nextDouble();
        System.out.println("O valor da temperatura em Farenheit é:");
        System.out.println(32+(tempCelcius/5)*9);
    }
}
