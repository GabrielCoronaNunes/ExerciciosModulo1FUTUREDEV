package br.com.futuredev.exercicios3;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        //VARIAVEIS
        double numeros[] = new double[3];
        double media;

        //INPUT
        Scanner input = new Scanner(System.in);
        System.out.println("Insira três números.");
        for (int i =0; i <= 2; i++) {
            numeros[i] = input.nextInt();
        }
        //CÁLCULO
        media = (numeros[0] + numeros[1] + numeros[2]) / 3;
        //OUTPUT
        System.out.println("A média é: " + media + ".");
    }
}
