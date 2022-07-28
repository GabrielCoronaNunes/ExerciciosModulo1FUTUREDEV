//[M1S01] Ex 4 - Transformação
//Criar um projeto com nome "QuartoExercicio" onde o usuário digite um número (até 255) e transforme em um caractere. Imprimir o resultado da transformação (cast) no console.


package br.com.futuredev.semana1;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        //INPUT

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número de 1 até 255");
        int numero = input.nextInt();
        char caractere = (char) numero;

        //OUTPUT

        if (numero <= 255 && numero > 0) {

            System.out.println(caractere);
        } else {
            System.out.println("Digite um número válido.");
        }
    }
}
