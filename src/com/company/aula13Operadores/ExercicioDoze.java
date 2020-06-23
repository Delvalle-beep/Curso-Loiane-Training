package com.company.aula13Operadores;

import java.util.Scanner;

public class ExercicioDoze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe aqui a sua altura:");
        double altura = scan.nextDouble();
        System.out.println("O seu peso ideal é: ");
        System.out.println((72.7*altura)-58);
    }
}
