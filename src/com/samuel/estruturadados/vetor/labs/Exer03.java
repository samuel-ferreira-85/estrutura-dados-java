package com.samuel.estruturadados.vetor.labs;

import com.samuel.estruturadados.vetor.Lista;

// Implementando o método contém
public class Exer03 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("a");
        lista.adiciona("b");
        lista.adiciona("a");

        System.out.println(lista);

        lista.remover(2);

        System.out.println(lista);

        lista.remover("b");

        System.out.println(lista);


    }
}
