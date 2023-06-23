package com.samuel.estruturadados.pilha.teste;

import com.samuel.estruturadados.pilha.Pilha;

public class Aula16 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();
        Pilha<Integer> pilha2 = new Pilha<>();

        adicionaElementos(8, pilha);

        System.out.println(pilha.topo());
        System.out.println(pilha2.topo());
    }

    private static void adicionaElementos(int i, Pilha<Integer> pilha) {
        for (int j = 1; j <= i; j++) {
            pilha.empilha(j);
        }
    }
}
