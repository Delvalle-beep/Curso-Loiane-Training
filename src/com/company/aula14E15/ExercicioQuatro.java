package com.company.aula14E15;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma letra");
        String letra = scan.nextLine();
        switch (letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Você digitou uma vogal");
                break;
            default:
                System.out.println("Você digitou uma consoante");
                break;
        }
    }
}
