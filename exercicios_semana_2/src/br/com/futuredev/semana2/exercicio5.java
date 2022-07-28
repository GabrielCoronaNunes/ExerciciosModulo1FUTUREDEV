//[M1S02] Ex 5 - Média
//Faça um programa que leia as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. Se a nota for maior ou igual a 6.0, deve ser apresentada a mensagem “Aprovado”, caso contrário deve ser apresentada a mensagem “Reprovado”.


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
