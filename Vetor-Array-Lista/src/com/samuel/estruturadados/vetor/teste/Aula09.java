package com.samuel.estruturadados.vetor.teste;

import com.samuel.estruturadados.vetor.Vetor;

public class Aula09 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");

        System.out.println(vetor);

        vetor.remover(0);

        System.out.println("Removendo pelo elemento");

        vetor.remover("B");
        System.out.println(vetor);

    }
}
