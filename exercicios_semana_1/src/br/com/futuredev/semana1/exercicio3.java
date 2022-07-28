package br.com.futuredev.semana1;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
    //INPUT
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu passatempo favorito e a frequência praticada:");
        String passatempo = entrada.nextLine();
        int frequência = entrada.nextInt();
    //OUTPUT
        System.out.println("O passatempo favorito é: " + passatempo +". E a frequência é: " + frequência);

    }
}
