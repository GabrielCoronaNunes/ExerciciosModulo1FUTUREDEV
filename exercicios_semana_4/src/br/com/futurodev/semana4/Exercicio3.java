//Faça um algoritmo para ler 50 números e armazenar em um vetor VET,
// verificar e escrever se existem números repetidos no vetor VET e em que posições se encontram.


package br.com.futurodev.semana4;
import java.util.*;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] vet = new int[50];
        boolean[] numerosRepetidos = new boolean[50];

        for (int i = 0; i < 50; i++) {
            int numeroAleartorio = new Random().nextInt(50);
            vet[i] = numeroAleartorio;
        }
      for (int i = 0; i <50; i++) {
        for (int j =i+1; j<50; j++) {
            if (numerosRepetidos[j] == false) {
                if (vet[i] == vet[j]) {
                    numerosRepetidos[j] = true;
                    System.out.println("Número: " + vet[j] + " repetido em: " + j);
                }
            }
        }

      }

    }


    }

