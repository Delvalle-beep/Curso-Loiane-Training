package com.company.aula13Operadores;

import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o quanto você ganha por hora:");
        double salarioPorHora = scan.nextDouble();
        System.out.println("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scan.nextInt();
        System.out.println("O seu salário mensal é: " + salarioPorHora*horasTrabalhadas);
    }
}
