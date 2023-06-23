package com.samuel.estruturadados.vetor.labs;

import com.samuel.estruturadados.vetor.Contato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer07 extends Exer06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Contato> arrayList = new ArrayList<>();

        criarContatosDinamicamente(5, arrayList);

        int opcao = 1;

        while(opcao != 0) {
            opcao = obterOpcaoMenu(scanner);

            switch (opcao) {
                case 1: adicionarContatoFinal(scanner, arrayList);
                    break;
                case 2: adicionarContatoPosicao(scanner, arrayList);
                    break;
                case 3: obterContatoPosicao(scanner, arrayList);
                    break;
                case 4: obterContato(scanner, arrayList);
                    break;
                case 5:
                    pesquisarUltimoIndice(scanner, arrayList);
                    break;
                case 6:
                    pesquisarContatoExiste(scanner, arrayList);
                    break;
                case 7:
                    excluirPorPosicao(scanner, arrayList);
                    break;
                case 8:
                    excluirContato(scanner, arrayList);
                    break;
                case 9:
                    imprimeTamanhoLista(arrayList);
                    break;
                case 10:
                    limparLista(arrayList);
                    break;
                case 11:
                    imprimirLista(arrayList);
                    break;
                default:
                    break;
            }

        }
        System.out.println("Usuário digitou 0, programa terminado");
        scanner.close();
    }
    private static void imprimirLista(List<Contato> lista){

        System.out.println(lista);
    }

    private static void limparLista(List<Contato> lista){

        lista.clear();

        System.out.println("Todos os contatos do vetor foram excluídos");
    }

    private static void imprimeTamanhoLista(List<Contato> lista){

        System.out.println("Tamanho do vetor é de: " + lista.size());
    }

    private static void excluirPorPosicao(Scanner scan, List<Contato> lista){

        int pos = lerInformacaoInt("Entre com a posição a ser removida", scan);

        try {

            lista.remove(pos);

            System.out.println("Contato excluído");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirContato(Scanner scan, List<Contato> lista){

        int pos = lerInformacaoInt("Entre com a posição a ser removida", scan);

        try {

            Contato contato = lista.get(pos);

            lista.remove(contato);

            System.out.println("Contato excluído");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner scan, List<Contato> lista){

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = lista.get(pos);

            boolean existe = lista.contains(contato);

            if (existe){
                System.out.println("Contato existe, seguem dados:");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe");
            }

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner scan, List<Contato> lista){

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = lista.get(pos);

            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
            pos = lista.lastIndexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obterContato(Scanner scan, List<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.get(pos);

            System.out.println("O contato existe, segue os dados:");
            System.out.println(contato);

            System.out.println("Fazendo a pesquisa do contato encontrado");
            pos = lista.indexOf(contato);

            System.out.println("Contato encontrado na posição " + pos);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static void obterContatoPosicao(Scanner scan, List<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.get(pos);
            System.out.println("O contato existe, segue os dados:");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }

    private static void adicionarContatoPosicao(Scanner scan, List<Contato> lista) {
        System.out.println("Criando um contato. Entre com as informações:");
        String nome = lerInformacao("Entre com o nome:", scan);
        String telefone = lerInformacao("Entre com o telefone:", scan);
        String email = lerInformacao("Entre com o email:", scan);

        Contato contato = new Contato(nome, telefone, email);

        int pos = lerInformacaoInt("Entre com a posição a adicionar o contato", scan);

        try {
            lista.add(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado.");
        }
    }

    private static void adicionarContatoFinal(Scanner scan, List<Contato> lista) {
        System.out.println("Criando um contato. Entre com as informações:");
        String nome = lerInformacao("Entre com o nome:", scan);
        String telefone = lerInformacao("Entre com o telefone:", scan);
        String email = lerInformacao("Entre com o email:", scan);

        Contato contato = new Contato(nome, telefone, email);

        lista.add(contato);
        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void criarContatosDinamicamente(int quantidade, List<Contato> lista){

        Contato contato;

        for (int i=1; i<=quantidade; i++){

            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("1111111"+i);
            contato.setEmail("contato"+i+"@email.com");

            lista.add(contato);
        }
    }
}
