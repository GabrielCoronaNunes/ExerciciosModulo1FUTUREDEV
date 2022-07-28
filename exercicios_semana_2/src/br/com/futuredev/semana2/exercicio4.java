//[M1S02] Ex 4 - Troca de valores
//Crie um programa que peça um número ao usuário e armazene ele na variável x. Depois peça outro número e armazene na variável y. Mostre esses números. Em seguida, faça com que x passe a ter o valor de y, e que y passe a ter o valor de x.


package br.com.futuredev.semana2;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        //VARIAVEIS
        int numeroUmOriginal;
        int numeroDoisOriginal;
        int numeroUmInvertido;
        int numeroDoisInvertido;

        //INPUT
        Scanner input = new Scanner(System.in);
        System.out.println("Digite dois números.");
        numeroUmOriginal = input.nextInt();
        numeroDoisOriginal = input.nextInt();

        //INVERSÃO DE NÚMEROS
        numeroUmInvertido = numeroDoisOriginal;
        numeroDoisInvertido = numeroUmOriginal;

        //OUTPUT
        System.out.println("Os números que você digitou foram: " + numeroUmOriginal + " e " + numeroDoisOriginal +
                ".Invertendo eles ficam: " + numeroUmInvertido + " e " + numeroDoisInvertido + ".");


    }
}
