//[M1S02] Ex 3 - Maior e menor
//Faça um programa que peça dois números ao usuário e mostre qual o maior e qual o menor.


package br.com.futuredev.semana2;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        //VARIÁVEIS
        int numeroUm;
        int numeroDois;

        //INPUT
        Scanner input = new Scanner(System.in);
        System.out.println("Digite dois números");
        numeroUm = input.nextInt();
        numeroDois = input.nextInt();

        //OUTPUT
        System.out.println("O maior número é: " + Math.max(numeroDois, numeroDois));

    }
}
