package com.samuel.estruturadados.vetor.labs;

import com.samuel.estruturadados.vetor.Lista;

// Implementando o método contém
public class Exer01 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("a");
        lista.adiciona("b");
        lista.adiciona("c");

        System.out.println(lista.contem("a"));
        System.out.println(lista.contem("d"));
        System.out.println(lista.contem("b"));

    }
}
