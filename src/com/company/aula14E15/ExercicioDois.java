package com.company.aula14E15;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numA = scan.nextInt();
        if (numA>=0){
            System.out.println("O número é positivo");
        }
        else{
            System.out.println("O número é negativo");
        }
    }
}
