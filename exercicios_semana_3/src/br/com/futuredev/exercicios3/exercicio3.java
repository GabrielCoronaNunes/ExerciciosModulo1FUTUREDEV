//[M1S03] Ex 3 - Calcular média - usando ArrayList e loop
//Peça ao usuário quantas notas ele precisa informar. Armazene todas as notas em um ArrayList utilizando o loop que preferir (while/do-while/for).
//Após informado todas as notas, utilize o laço de repetição "for" para realizar a soma de todas as notas e posteriormente exibir a média.


package br.com.futuredev.exercicios3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        //VARIAVEIS
        int quantidadeNotas;
        List<Double> notas = new ArrayList<>();
        double mediaFinal = 0;
        int i = 0;

        //INPUT
        Scanner quantidadeNotasInput = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas: ");
        quantidadeNotas = quantidadeNotasInput.nextInt();

        do {
            Scanner notaInput = new Scanner(System.in);
            System.out.println("Digite a nota");
            notas.add(notaInput.nextDouble());
            i++;
        } while (i < quantidadeNotas);
        //CÁLCULO
        for (int j = 0; j <quantidadeNotas; j++){
        mediaFinal += notas.get(j);
        }
        mediaFinal /= quantidadeNotas;
        System.out.println("A média é: " + mediaFinal + ".");
    }
}
