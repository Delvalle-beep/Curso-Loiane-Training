package com.company.aula14E15;

import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu período:");
        System.out.println("M-Matutino ou V-Vespertino ou N-Noturno:");
        String periodo = scan.next();
        if(periodo == "M"){
            System.out.println("Bom dia");
        }else if(periodo == "V"){
            System.out.println("Boa tarde");
        }else if(periodo =="N"){
            System.out.println("Boa noite");
        }else{
            System.out.println("Valor inválido!");
        }
    }
}
