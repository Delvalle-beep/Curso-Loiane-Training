package com.company.aula13Operadores;

import java.util.Scanner;

public class ExercicioTreze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o quanto você ganha por hora:");
        double salarioPorHora = scan.nextDouble();
        System.out.println("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scan.nextInt();
        double salarioBruto = salarioPorHora*horasTrabalhadas;
        double inss = (salarioBruto/100)*8;
        double sindicato = (salarioBruto/100)*5;
        double ir = (salarioBruto/100)*11;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto-totalDescontos;
        System.out.println("O seu salário bruto mensal é: " + salarioBruto);
        System.out.println("O total de Descontos é:" +totalDescontos+
                " sendo que "+inss+ " reais é de INSS ,"+sindicato+" reais é de sindicato e "
        +ir+" reais é de imposto de renda.");
        System.out.println("O seu salário líquido é de "+salarioLiquido+" reais.");


    }
}
