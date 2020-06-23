package com.company.aula14E15;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual é o seu sexo?");
        System.out.println("Digite F-Feminino e M-Masculino");
        String sexo = scan.nextLine();
        switch (sexo){
            case "F":
                System.out.println("Você escolheu feminino");
                break;
            case "M":
                System.out.println("Você escolheu masculino");
                break;
            default:
                System.out.println("Sexo inválido");
                break;
        }
    }
}
