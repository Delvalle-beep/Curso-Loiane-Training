package com.company.aula13Operadores;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado para calcular a área:");
        int ladoQuadrado = scan.nextInt();
        System.out.println("A área do quadrado é "+ ladoQuadrado*ladoQuadrado + " o dobro da área é:" + ladoQuadrado*ladoQuadrado*2);
    }
}
