package com.samuel.estruturadados.vetor.teste;

import com.samuel.estruturadados.vetor.Vetor;

public class Aula5 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Harry");
        vetor.adiciona("Hermione");
        vetor.adiciona("Ronny");

        System.out.println(vetor.busca(9));
    }
}
