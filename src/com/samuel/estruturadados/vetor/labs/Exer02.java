package com.samuel.estruturadados.vetor.labs;

import com.samuel.estruturadados.vetor.Lista;

// Implementando o método contém
public class Exer02 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("a");
        lista.adiciona("b");
        lista.adiciona("a");

        System.out.println(lista.ultimoIndice("a"));


    }
}
