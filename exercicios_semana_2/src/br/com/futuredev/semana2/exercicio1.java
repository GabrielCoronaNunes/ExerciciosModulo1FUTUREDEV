package br.com.futuredev.semana2;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        //VARIÁVEIS
        double salarioFuncionario;
        double salarioMinimo;
        double resultado;

        //INPUT

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do salário do funcionário, e em sequência o valor do salário mínimo.");
        salarioFuncionario = input.nextDouble();
        salarioMinimo = input.nextDouble();

        //CÁLCULO
        resultado = salarioFuncionario / salarioMinimo;

        //OUTPUT
        System.out.println("O funcionário recebe " + resultado + " salários mínimos");

    }
}
