package com.samuel.estruturadados.vetor.teste;

import com.samuel.estruturadados.vetor.Vetor;

public class Aula06 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Harry");
        vetor.adiciona("Hermione");
        vetor.adiciona("Ronny");

        System.out.println(vetor.busca("hermione"));
        System.out.println(vetor.busca("Hermione"));
    }
}
