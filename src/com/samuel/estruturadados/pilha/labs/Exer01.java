package com.samuel.estruturadados.pilha.labs;

import com.samuel.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        Scanner scan = new Scanner(System.in);

        for (int i=1; i<=10; i++){

            System.out.println("Entre com um número:");

            int num = scan.nextInt();

            if (num % 2 == 0){

                System.out.println("Empilhando o número " + num);
                pilha.empilha(num);
            } else {
                Integer desempilhado = pilha.desempilhar();

                if (desempilhado == null){
                    System.out.println("Pilha está vazia");
                } else {
                    System.out.println("Número ímpar, desempilhando um elemento da pilha: "
                            + desempilhado);
                }
            }
        }
        scan.close();

        System.out.println("Todos os número foram lidos, desempilhando números da pilha");

        while (!pilha.estaVazia()){
            System.out.println("Desempilhando um elemento da pilha: "
                    + pilha.desempilhar());
        }

        System.out.println("Todos os elementos foram desempilhados");
    }

}
