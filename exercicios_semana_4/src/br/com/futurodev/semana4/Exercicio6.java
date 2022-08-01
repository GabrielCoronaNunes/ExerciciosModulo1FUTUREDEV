//Crie um algoritmo que tenha uma lista de número inteiro dentro dele,
// todos os números repetidos devem ser removidos desta lista. Utilize Sets para esse programa.

package br.com.futurodev.semana4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Exercicio6 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(4);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(8);
        numeros.add(8);
        numeros.add(9);
        numeros.add(9);
        numeros.add(10);
        Set<Integer> numerosSemRepetidos = new HashSet<>(numeros);
        System.out.println(numerosSemRepetidos);
    }
}
