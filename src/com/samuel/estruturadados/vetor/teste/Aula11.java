package com.samuel.estruturadados.vetor.teste;

import com.samuel.estruturadados.vetor.Lista;

public class Aula11 {

    public static void main(String[] args) {

        Lista<Integer> vetor = new Lista<>(5); // instanciando com o construtor java efetivo

        // instanciando com o construtor reflect
        Lista<String> vetorS = new Lista<>(5, String.class);

        vetor.adiciona(4);
        vetor.adiciona(6);
        vetor.adiciona(8);

        vetorS.adiciona("4");
        vetorS.adiciona("6");
        vetorS.adiciona("8");

        var busca = vetor.busca(2);

        System.out.println(vetor);
        System.out.println(busca);
        System.out.println(vetorS);

    }
}
