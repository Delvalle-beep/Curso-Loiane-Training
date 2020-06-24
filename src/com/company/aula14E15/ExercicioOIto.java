package com.company.aula14E15;

import java.util.Scanner;

public class ExercicioOIto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o preço do primeiro produto");
        double precoA = scan.nextDouble();
        System.out.println("Digite o preço do segundo produto");
        double precoB = scan.nextDouble();
        System.out.println("Digite o preço do terceiro produto");
        double precoC = scan.nextDouble();
        if(precoA<precoB && precoA<precoC){
            System.out.println("Compre o primeiro produto");
        }else if(precoB<precoA && precoB<precoC){
            System.out.println("Compre o segundo produto");
        }else if(precoC<precoA && precoC<precoB){
            System.out.println("Compre o terceiro produto");
        }
    }
}
