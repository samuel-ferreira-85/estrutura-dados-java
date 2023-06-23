package com.samuel.estruturadados.pilha.teste;

import java.util.Stack;

public class Aula18 {

    public static void main(String[] args) {

        Stack<Integer> pilha = new Stack<>();

        System.out.println("A pilha está vazia: " + pilha.isEmpty()); // ver se está vazia

        pilha.push(23);
        pilha.push(34);
        pilha.push(2);

        boolean vazia = pilha.isEmpty();
        System.out.println("A pilha está vazia: " + vazia);

        System.out.println("O tamanho da pilha: " + pilha.size());

        System.out.println("O topo da pilha: " + pilha.peek()); // ver quem está no topo da pilha
        pilha.pop(); // remove o elemento do topo
        System.out.println(pilha);

        System.out.println("O tamanho da pilha: " + pilha.size());

    }

}
