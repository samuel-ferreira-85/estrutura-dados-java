package com.samuel.estruturadados.vetor.teste;

import com.samuel.estruturadados.vetor.Vetor;

public class Aula4 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Samuel");
        vetor.adiciona("Avila");
        vetor.adiciona("João");

        System.out.println("O tamanho real do vetor é: " + vetor.getTamanhoReal());
        System.out.println(vetor);

    }
}
