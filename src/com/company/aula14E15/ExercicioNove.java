package com.company.aula14E15;

import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int numA = scan.nextInt();
        System.out.println("Digite o segundo numero");
        int numB = scan.nextInt();
        System.out.println("Digite o terceiro numero");
        int numC = scan.nextInt();

        if(numA <= numB && numA <= numC && numB<= numC){
            //numA é maior
            //numB é maior
            //numA < numB < numC
            System.out.println(numC +"-"+numB+"-"+numA);
        }else if(numA <= numB && numA <= numC && numC<= numB){
            //numA é menor
            //numB é maior
            //numA < numC < numB
            System.out.println(numB +"-"+numC+"-"+numA);
        }else if(numB <= numA && numB <= numC && numA<= numB) {
            //numB é menor
            //numC é maior
            //numB < numA < numC
            System.out.println(numC + "-" + numA + "-" + numB);
        }else if(numB <= numA && numB <= numC && numC<= numA){
            //numB é menor
            //numA é maior
            //numB < numC < numA
            System.out.println(numA +"-"+numC+"-"+numB);
        }else if(numC <= numA && numC <= numB && numA<= numB){
            //numC é menor
            //numB é maior
            //numC < numA < numB
            System.out.println(numB +"-"+numA+"-"+numC);
        }else if(numC <= numA && numC <= numB && numA <= numB){
            //numC é menor
            //numB é maior
            //numC < numA < numB
            System.out.println(numB +"-"+numC+"-"+numA);
        }

    }
}
