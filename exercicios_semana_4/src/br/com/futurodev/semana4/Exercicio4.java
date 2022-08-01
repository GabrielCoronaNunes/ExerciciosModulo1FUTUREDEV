//Crie um programa que leia 10 números fornecidos pelo usuário e após isso os coloque em ordem
// decrescente. A lista deve ser uma ArrayList.

package br.com.futurodev.semana4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> numerosUsuario = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i <10; i++) {
            System.out.println("Digite 10 números");
            numerosUsuario.add(input.nextInt());
        }
       Collections.sort(numerosUsuario, Collections.reverseOrder());
        System.out.println(numerosUsuario);

    }
}
