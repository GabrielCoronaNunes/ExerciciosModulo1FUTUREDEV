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
