package br.com.futuredev.semana2;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
    //VARIÁVEIS
        double lado1;
        double lado2;
        double lado3;
    //INPUT
        Scanner input = new Scanner(System.in);
        System.out.println("Digite em sequência os três lados do triângulo:");
        lado1 = input.nextDouble();
        lado2 = input.nextDouble();
        lado3 = input.nextDouble();
    //CÁLCULO
        if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2+lado3 > lado1){
            if (lado1 == lado2 && lado3 == lado2)
                System.out.println("É um triângulo equilatero");
            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
                System.out.println("É um triângulo isósceles");
            else
                System.out.println("É um triângulo escaleno");
        } else
            System.out.println("Não é um triângulo");

    }
}
