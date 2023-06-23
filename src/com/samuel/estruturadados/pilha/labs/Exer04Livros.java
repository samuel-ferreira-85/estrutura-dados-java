package com.samuel.estruturadados.pilha.labs;

import com.samuel.estruturadados.pilha.Pilha;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Exer04Livros {

    public static void main(String[] args) {

        Stack<Livro> pilha = new Stack<>();

        System.out.println("Pilha está vazia? " + pilha.isEmpty());

        geradorLivros(6, pilha);

        System.out.println("Pilha está vazia? " + pilha.isEmpty());
        System.out.println("O tamanho da pilha é " + pilha.size());


        System.out.println(pilha);

        System.out.println("O elemento que está no topo é: " + pilha.peek());

        System.out.println("Desempilhando a pilha de livros");

        while (!pilha.isEmpty()) {
            System.out.println("Desempilhando elemento: " + pilha.pop());
        }

        System.out.println("Todos os livros foram desempilhandos, pilha vazia: " + pilha.isEmpty());

    }

    private static void geradorLivros(int quantidade, Stack<Livro> pilha) {

        Livro livro;

        for (int i = 0; i < quantidade; i++) {
            livro = new Livro();
            livro.setNome("Livro"+i);
            livro.setAutor("Autor"+i);
            livro.setAnoLancamento(Integer.toString(geradorAno()));
            livro.setIsbn(geradorIsbn());

            pilha.add(livro);
        }
    }

    private static String geradorIsbn() {
        Random random = new Random();
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder(10);

        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(caracteres.length());
            char caractere = caracteres.charAt(index);
            sb.append(caractere);
        }
        return sb.toString();
    }

    private static int geradorAno() {
        Random random = new Random();
        int range = 2023 - 1980 + 1;
        int randomYear = 1980 + random.nextInt(range);
        return randomYear;
    }
}
