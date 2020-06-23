package com.company.aula14E15;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero:");
        double numA = scan.nextDouble();
        System.out.println("Digite outro numero:");
        double numB = scan.nextDouble();
        if(numA>numB){
            System.out.println("O numero maior é o :" +numA);

        }else if (numA==numB){
            System.out.println("Os números tem o mesmo valor");
        }
        else {
            System.out.println("O numero maior é o:"+numB);
        }
    }
}
