package com.company.aula13Operadores;

import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int numA = scan.nextInt();
        System.out.println("Agora digite outro número inteiro");
        int numB = scan.nextInt();
        System.out.println("E por último digite um número real");
        double numC = scan.nextDouble();
        System.out.println("O produto do dobro do primeiro com metade do segundo é:");
        System.out.println((numA*2)*(numB/2));
        System.out.println("A soma do triplo do primeiro com o terceiro é:");
        System.out.println((numA*3)+numC);
        System.out.println("O terceiro elevado ao cubo é :");
        System.out.println(numC*numC*numC);
    }
}
