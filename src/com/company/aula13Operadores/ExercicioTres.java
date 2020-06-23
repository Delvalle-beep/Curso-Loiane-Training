package com.company.aula13Operadores;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numeroA = scan.nextInt();
        System.out.println("Digite outro número:");
        int numeroB = scan.nextInt();
        System.out.println("A soma dos dois números é:");
        System.out.println(numeroA+numeroB);
    }
}

