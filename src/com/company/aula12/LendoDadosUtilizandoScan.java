package com.company.aula12;

import java.util.Scanner;

public class LendoDadosUtilizandoScan {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu nome :");
        String nomeCompleto =   scan.nextLine();
        System.out.println("O seu nome é: " + nomeCompleto );
    }
}
