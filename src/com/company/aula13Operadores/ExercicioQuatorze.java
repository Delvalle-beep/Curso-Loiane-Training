package com.company.aula13Operadores;

import java.util.Scanner;

public class ExercicioQuatorze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o tamanho do arquivo");
        double tamArquivo = scan.nextDouble();

        System.out.println("Entre com a velocidade da internet");
        double velInternet = scan.nextDouble();

        double tempo = tamArquivo/velInternet;

        System.out.println("Tempo do download "+tempo+ " minutos");
    }
}
