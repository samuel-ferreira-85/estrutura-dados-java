package com.samuel.estruturadados.pilha.teste;

import com.samuel.estruturadados.pilha.Pilha;

public class Aula15 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();
        Pilha<Integer> pilha2 = new Pilha<>();

        adicionaElementos(10, pilha);

        System.out.println(pilha.estaVazia());
        System.out.println(pilha2.estaVazia());
    }

    private static void adicionaElementos(int i, Pilha<Integer> pilha) {
        for (int j = 1; j <= i; j++) {
            pilha.empilha(j);
        }
    }
}
