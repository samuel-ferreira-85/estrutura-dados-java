package com.samuel.estruturadados.fila.teste;

import com.samuel.estruturadados.fila.Fila;

public class Aula19 {

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        System.out.println(fila.estaVazia()); //true
        System.out.println(fila.tamanho()); // 0


        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila);

        System.out.println(fila.tamanho());

        System.out.println(fila.espiar());

        fila.desenfileira();

        System.out.println(fila);
        System.out.println("tamanho: " + fila.tamanho());

        System.out.println(fila.espiar());

        fila.enfileira(4);

        System.out.println(fila);

        System.out.println("O elemento removido da fila foi: " + fila.desenfileira());

        System.out.println(fila);

    }
}
