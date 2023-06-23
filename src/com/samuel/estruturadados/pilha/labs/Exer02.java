package com.samuel.estruturadados.pilha.labs;

import com.samuel.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Pilha<Integer> par = new Pilha<Integer>();
        Pilha<Integer> impar = new Pilha<>();

        Scanner scan = new Scanner(System.in);

        for (int i=1; i<=10; i++){

            System.out.println("Entre com um número:");

            int num = scan.nextInt();

            if (num == 0) {
                // pilha par
                Integer desempilhado = par.desempilhar();
                if (desempilhado == null) {
                    System.out.println("Pilha vazia");
                } else {
                    System.out.println("Desempilhando da pilha PAR: " + desempilhado);
                }

                // pilha impar
                desempilhado = impar.desempilhar();
                if (desempilhado == null) {
                    System.out.println("Pilha vazia");
                } else {
                    System.out.println("Desempilhando da pilha IMPAR: " + desempilhado);
                }

            } else if (num % 2 == 0){
                System.out.println("Número par, empilhando na pilha PAR " + num);
                par.empilha(num);
            } else {
                System.out.println("Número impar, empilhando na pilha IMPAR " + num);
               impar.empilha(num);
            }
        }
        scan.close();

        System.out.println("Todos os número foram lidos, desempilhando números da pilha");

        while (!par.estaVazia()){
            System.out.println("Desempilhando um elemento da pilha PAR: "
                    + par.desempilhar());
        }
        while (!impar.estaVazia()){
            System.out.println("Desempilhando um elemento da pilha IMPAR: "
                    + impar.desempilhar());
        }

        System.out.println("Todos os elementos foram desempilhados");
    }

}
