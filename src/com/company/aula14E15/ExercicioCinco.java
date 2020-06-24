package com.company.aula14E15;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("DIgite a primeira nota:");
        double notaUm = scan.nextDouble();
        System.out.println("DIgite a segunda nota:");
        double notaDois = scan.nextDouble();
        double media = (notaDois+notaUm)/2;
        if(media>=7){
            System.out.println("Aprovado");
        }else if(media==10){
            System.out.println("Aprovado com distinção");
        }else{
            System.out.println("Reprovado");
        }
    }
}
