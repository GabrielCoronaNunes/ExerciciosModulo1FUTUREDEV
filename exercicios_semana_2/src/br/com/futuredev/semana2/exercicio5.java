package br.com.futuredev.semana2;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        //VARIÁVEIS
        double parcialUm;
        double parcialDois;
        String resultado;

        //INPUT
        Scanner input = new Scanner(System.in);
        System.out.println("Digite as duas parciais");
        parcialUm = input.nextInt();
        parcialDois = input.nextInt();

        //CÁLCULO
        resultado = (parcialUm + parcialDois) / 2  >= 6.0 ? "Aprovado" : "Reprovado";
        System.out.println("O aluno está: " + resultado);
        //



    }
}
