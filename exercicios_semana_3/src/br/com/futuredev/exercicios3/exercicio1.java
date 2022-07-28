//[M1S03] Ex 1 - Populando array
//Utilizando um array de 10 posições, peça ao usuário que informe 10 números. O sistema deve imprimir todos no console.


package br.com.futuredev.exercicios3;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        //VARIAVEIS
        int[] arrays = new int[10];
        //INPUT
        Scanner input = new Scanner(System.in);
        for(int i = 0; i <= 9; i++) {
            System.out.println("Digite um número");
arrays[i] = input.nextInt();
        }
        //OUTPUT
        for (int i = 0; i <= 9; i++) {
            System.out.println("Os números são: " + arrays[i] + ".");
        }

    }
}
