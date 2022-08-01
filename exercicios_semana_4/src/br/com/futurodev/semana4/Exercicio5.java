//Crie um programa que receba vários nomes até que ele receba a palavra “fim”,
// após isso o programa deve demonstrar o último item da fila até que não haja mais item em uma fila.
// Para esse exercício deve ser utilizado Linked Lists.

package br.com.futurodev.semana4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {
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
