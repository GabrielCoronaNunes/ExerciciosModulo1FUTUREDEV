//[M1S03] Ex 4 - Número múltiplo
//Crie um número aleatório de 0 à 100 e o exiba ao usuário. Peça ao usuário que digite um múltiplo do número aleatório. Somente saia do laço caso o usuário informe um número correto.



package br.com.futuredev.exercicios3;

import java.util.Random;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
    //VARIAVEIS
     final int NUMERO_MAXIMO = 100;
     int numeroAleartorio = new Random().nextInt(NUMERO_MAXIMO + 1);
     int numero = 0;

     //INPUT
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número múltiplo de: " + numeroAleartorio + ".");
do {
    numero = input.nextInt();
} while (numero % numeroAleartorio !=0);
        System.out.println("Parabéns, os números são múltiplos!");
    }
}
