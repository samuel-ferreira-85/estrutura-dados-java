package com.samuel.estruturadados.vetor.teste;

import com.samuel.estruturadados.vetor.VetorObject;

public class Aula10 {

    public static void main(String[] args) {

        VetorObject vetor = new VetorObject(5);

        vetor.adiciona(4);
        vetor.adiciona("5");
        vetor.adiciona(6);
        vetor.adiciona("7");
        vetor.adiciona(8);

        var busca = vetor.busca(3);

        System.out.println(vetor);
        System.out.println(busca);

    }
}
