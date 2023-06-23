package com.samuel.estruturadados.pilha.teste;

import com.samuel.estruturadados.pilha.Pilha;

public class Aula14 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        adicionaElementos(10, pilha);

        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }

    private static void adicionaElementos(int i, Pilha<Integer> pilha) {
        for (int j = 1; j <= i; j++) {
            pilha.empilha(j);
        }
    }
}
