package br.com.futuredev.semana2;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        //VARIÁVEIS

        double numeroUm;
        double numeroDois;
        int operacao;
        double resultado = 0;

        //INPUT
        Scanner input = new Scanner(System.in);
        System.out.println("Digite qual operação deseja fazer." +
                " 1: Soma; 2: Subtração; 3: Multiplicação. 4" +
                ": Divisão. E em seguida dois números para utilizar.");
        operacao = input.nextInt();
        numeroUm = input.nextDouble();
        numeroDois = input.nextDouble();

        // OPERAÇÃO

        switch (operacao) {
            case 1:
                resultado = numeroUm + numeroDois;
                break;
            case 2:
                resultado = numeroUm - numeroDois;
                break;
            case 3:
                resultado = numeroUm * numeroDois;
                break;
            case 4:
                resultado = numeroUm / numeroDois;
                break;
        }

        //PAR E POSITIVO
        boolean par = resultado % 2 == 0.0;
        boolean positivo = resultado >= 0.0;

        //OUTPUT
        if (par && positivo) {
            System.out.println("O resultado é: " + resultado + ". O número é par e positivo.");
        } else if (par) {
            System.out.println("O resultado é: " + resultado + ". O número é par e negativo.");
        } else if (positivo) {
            System.out.println("O resultado é: " + resultado + ". O número é impar e positivo.");
        } else {
            System.out.println("O resultado é: " + resultado + ". O número é impar e negativo.");
        }

    }
}
