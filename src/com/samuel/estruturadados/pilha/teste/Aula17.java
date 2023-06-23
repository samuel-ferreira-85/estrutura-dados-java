package com.samuel.estruturadados.pilha.teste;

import com.samuel.estruturadados.pilha.Pilha;

public class Aula17 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        adicionaElementos(2, pilha);

        System.out.println(pilha);
        System.out.println(pilha.tamanho());

        pilha.desempilhar();

        System.out.println(pilha);
        System.out.println(pilha.tamanho());

    }

    private static void adicionaElementos(int i, Pilha<Integer> pilha) {
        for (int j = 1; j <= i; j++) {
            pilha.empilha(j);
        }
    }
}
