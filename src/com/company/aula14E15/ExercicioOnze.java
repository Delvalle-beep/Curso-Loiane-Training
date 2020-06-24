package com.company.aula14E15;

import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite aqui o seu salaŕio");
        double salario = scan.nextDouble();
        if(salario>1500){
            double aumento = (salario/100)*5;
            System.out.println("O seu salário com aumento é");
            System.out.println(salario+aumento+ " reais");
            System.out.println("Foi aplicado um aumento de 5%");
            System.out.println("O valor do aumento foi de " +aumento+ "reais");
        }else if(salario>700){
            double aumento = (salario/100)*10;
            System.out.println("O seu salário com aumento é");
            System.out.println(salario+aumento+ " reais");
            System.out.println("Foi aplicado um aumento de 10%");
            System.out.println("O valor do aumento foi de " +aumento+ "reais");
        }else if(salario>280){
            double aumento = (salario/100)*15;
            System.out.println("O seu salário com aumento é");
            System.out.println(salario+aumento+ " reais");
            System.out.println("Foi aplicado um aumento de 15%");
            System.out.println("O valor do aumento foi de " +aumento+ "reais");
        }else{
            double aumento =(salario/100)*20;
            System.out.println("O seu salário com aumento é");
            System.out.println(salario+aumento+ " reais");
            System.out.println("Foi aplicado um aumento de 20%");
            System.out.println("O valor do aumento foi de " +aumento+ "reais");
        }
    }
}
