//[M1S04] Ex 2 - Vetor de nomes
//Elabore um algoritmo que armazene em um vetor o nome de 5 convidados
// de uma festa e exiba o nome dos mesmos.


package br.com.futurodev.semana4;


import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //VARIÁVEIS
        String[] convidadosNomes = new String[4];
        int quantidadeUsuariosExibidos;
        convidadosNomes[0] = "José";
        convidadosNomes[1] = "Maria";
        convidadosNomes[2] = "Thiago";
        convidadosNomes[3] = "João";

//INPUT
        Scanner quantidadeUsuariosExibidosInput = new Scanner(System.in);
        System.out.println("Digite a quantidade de convidados a serem mostrados.");
        quantidadeUsuariosExibidos = quantidadeUsuariosExibidosInput.nextInt();

        //OUTPUT
        for (int i = 0; i < quantidadeUsuariosExibidos; i++) {
            System.out.println(convidadosNomes[i]);

        }
    }}
