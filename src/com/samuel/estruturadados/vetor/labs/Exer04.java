package com.samuel.estruturadados.vetor.labs;

import com.samuel.estruturadados.vetor.Lista;

// Implementando o método obter
public class Exer04 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("a");
        lista.adiciona("b");
        lista.adiciona("c");

        System.out.println(lista.obtem(0));

        System.out.println(lista.obtem(2));

    }
}
