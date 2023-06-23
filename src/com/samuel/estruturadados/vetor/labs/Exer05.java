package com.samuel.estruturadados.vetor.labs;

import com.samuel.estruturadados.vetor.Lista;

// Implementando o método obter
public class Exer05 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("a");
        lista.adiciona("b");
        lista.adiciona("c");

        System.out.println(lista);
        lista.limpar();
        System.out.println(lista.getTamanhoReal());
        System.out.println(lista);

    }
}
