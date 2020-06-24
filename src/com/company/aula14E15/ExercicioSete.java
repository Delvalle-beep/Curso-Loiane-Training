package com.company.aula14E15;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        double numA = scan.nextDouble();
        System.out.println("Digite o segundo numero:");
        double numB = scan.nextDouble();
        System.out.println("Digite o terceiro numero:");
        double numC = scan.nextDouble();
        if(numA>numB && numA>numC){
            System.out.println(numA);
        }else if (numB>numA && numB>numC){
            System.out.println(numB);
        }else if (numC>numA && numC>numB){
            System.out.println(numC);
        }

        if(numA<numB && numA<numC){
            System.out.println(numA);
        }else if(numB<numA && numB<numC){
            System.out.println(numB);
        }else if (numC<numA && numC<numB){
            System.out.println(numC);
        }
    }
}
