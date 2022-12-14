//[M1S03] Ex 5 - Hobby - do-while
//Utilizando o laço "do-while", peça ao usuário que informe seus passatempos preferidos. Armazene-os em um ArrayList até que o usuário escreva "fechar". Ao sair do laço, mostrar no console todos os passatempos inseridos.


package br.com.futuredev.exercicios3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        //VARIAVEIS
        List<String> hobbies = new ArrayList<>();
        String hobbieInformado;

        //INPUT
        Scanner hobbiesInput = new Scanner(System.in);
        System.out.println("Informe seus hobbies favoritos. Digite 'FECHAR' para fechar.");

        do {
            hobbieInformado = hobbiesInput.next();
            if (!hobbieInformado.toUpperCase().equals("FECHAR")) {
                hobbies.add(hobbieInformado);
                System.out.println("Passatempo inserido com sucesso.");
            }
        } while (!hobbieInformado.toUpperCase().equals("FECHAR"));
        System.out.println(("\nSeus hobbies inseridos foram:"));
        for (String hobbie : hobbies) {
            System.out.println(hobbie);
        }
    }
}
