package com.company.aula14E15;

import java.util.Scanner;

public class ExercicioDoze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite aqui o quanto ganha com hora :");
        double horaSalario = scan.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas no mês");
        double horaMes = scan.nextDouble();
        double salarioBruto = horaMes*horaSalario;
        if(salarioBruto>2500){
            double descontoIR = (salarioBruto/100)*20;
            double INSS  = (salarioBruto/100)*10;
            double fgts = (salarioBruto/100)*11;
            double totalDescontos = descontoIR-INSS-fgts;
            double salarioLiquido = totalDescontos - salarioBruto;
            System.out.println("O total de descontos é "+totalDescontos+ " reais");
            System.out.println("O seu salário líquido é "+salarioLiquido+" reais");
        }else if (salarioBruto<=2500){
            double descontoIR = (salarioBruto/100)*10;
            double INSS  = (salarioBruto/100)*10;
            double fgts = (salarioBruto/100)*11;
            double totalDescontos = descontoIR-INSS-fgts;
            double salarioLiquido = totalDescontos - salarioBruto;
            System.out.println("O total de descontos é "+totalDescontos+ " reais");
            System.out.println("O seu salário líquido é "+salarioLiquido+" reais");
        }else if(salarioBruto<=1500){
            double descontoIR = (salarioBruto/100)*5;
            double INSS  = (salarioBruto/100)*10;
            double fgts = (salarioBruto/100)*11;
            double totalDescontos = descontoIR-INSS-fgts;
            double salarioLiquido = totalDescontos - salarioBruto;
            System.out.println("O total de descontos é "+totalDescontos+ " reais");
            System.out.println("O seu salário líquido é "+salarioLiquido+" reais");
        }else{
            double INSS  = (salarioBruto/100)*10;
            double fgts = (salarioBruto/100)*11;
            double totalDescontos = INSS-fgts;
            double salarioLiquido = totalDescontos - salarioBruto;
            System.out.println("O total de descontos é "+totalDescontos+ " reais");
            System.out.println("O seu salário líquido é "+salarioLiquido+" reais");
        }


    }
}
