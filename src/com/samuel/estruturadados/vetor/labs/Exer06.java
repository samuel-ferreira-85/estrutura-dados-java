package com.samuel.estruturadados.vetor.labs;

import com.samuel.estruturadados.vetor.Contato;
import com.samuel.estruturadados.vetor.Lista;

import java.util.Random;
import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Lista<Contato> lista = new Lista<>(20);

        criarContatosDinamicamente(30, lista);

        int opcao = 1;

        while(opcao != 0) {
            opcao = obterOpcaoMenu(scanner);

            switch (opcao) {
                case 1: adicionarContatoFinal(scanner, lista);
                    break;
                case 2: adicionarContatoPosicao(scanner, lista);
                    break;
                case 3: obterContatoPosicao(scanner, lista);
                    break;
                case 4: obterContato(scanner, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(scanner, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(scanner, lista);
                    break;
                case 7:
                    excluirPorPosicao(scanner, lista);
                    break;
                case 8:
                    excluirContato(scanner, lista);
                    break;
                case 9:
                    imprimeTamanhoLista(lista);
                    break;
                case 10:
                    limparLista(lista);
                    break;
                case 11:
                    imprimirLista(lista);
                    break;
                default:
                    break;
            }

        }
        System.out.println("Usuário digitou 0, programa terminado");
        scanner.close();
    }
    private static void imprimirLista(Lista<Contato> lista){

        System.out.println(lista);
    }

    private static void limparLista(Lista<Contato> lista){

        lista.limpar();

        System.out.println("Todos os contatos do vetor foram excluídos");
    }

    private static void imprimeTamanhoLista(Lista<Contato> lista){

        System.out.println("Tamanho do vetor é de: " + lista.getTamanhoReal());
    }

    private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista){

        int pos = lerInformacaoInt("Entre com a posição a ser removida", scan);

        try {

            lista.remover(pos);

            System.out.println("Contato excluído");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirContato(Scanner scan, Lista<Contato> lista){

        int pos = lerInformacaoInt("Entre com a posição a ser removida", scan);

        try {

            Contato contato = lista.busca(pos);

            lista.remover(contato);

            System.out.println("Contato excluído");

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista){

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = lista.busca(pos);

            boolean existe = lista.contem(contato);

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

    private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista){

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {

            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
            pos = lista.ultimoIndice(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obterContato(Scanner scan, Lista<Contato> lista) {
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.busca(pos);

            System.out.println("O contato existe, segue os dados:");
            System.out.println(contato);

            System.out.println("Fazendo a pesquisa do contato encontrado");
            pos = lista.busca(contato);

            System.out.println("Contato encontrado na posição " + pos);
        } catch (Exception e) {
            System.out.println("Posição inválida!");
        }

    }

    private static void obterContatoPosicao(Scanner scan, Lista<Contato> lista) {

        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.busca(pos);
            System.out.println("O contato existe, segue os dados:");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }

    private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {
        System.out.println("Criando um contato. Entre com as informações:");
        String nome = lerInformacao("Entre com o nome:", scan);
        String telefone = lerInformacao("Entre com o telefone:", scan);
        String email = lerInformacao("Entre com o email:", scan);

        Contato contato = new Contato(nome, telefone, email);

        int pos = lerInformacaoInt("Entre com a posição a adicionar o contato", scan);

        try {
            lista.adiciona(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado.");
        }
    }

    private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {
        System.out.println("Criando um contato. Entre com as informações:");
        String nome = lerInformacao("Entre com o nome:", scan);
        String telefone = lerInformacao("Entre com o telefone:", scan);
        String email = lerInformacao("Entre com o email:", scan);

        Contato contato = new Contato(nome, telefone, email);

        lista.adiciona(contato);
        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    protected static int lerInformacaoInt(String msg, Scanner scan) {
        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {
            try {
                System.out.println(msg);
                String entrada = scan.nextLine();

                num = Integer.parseInt(entrada);

                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida. Digite novamente.");
            }
        }
        return num;
    }

    protected static String lerInformacao(String msg, Scanner scan) {
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }

    protected static int obterOpcaoMenu(Scanner scan) {
        String entrada;
        boolean entradaValida = false;
        int opcao = 0;

        while(!entradaValida) {
            System.out.println("Digite a opção desejada:");
            System.out.println("1: Adiciona contato ao final da lista;");
            System.out.println("2: Adiciona contato em uma posição específica;");
            System.out.println("3: Obtém contato de uma posição específica;");
            System.out.println("4: Consulta contato;");
            System.out.println("5: Consulta o último índice de contato;");
            System.out.println("6: Verifica se o contato existe;");
            System.out.println("7: Excluir por posição;");
            System.out.println("8: Excluir contato;");
            System.out.println("9: Verificar tamanho da lista;");
            System.out.println("10: Excluir todos contatos da lista;");
            System.out.println("11: Imprime a lista;");
            System.out.println("0: Para Sair;");

            try {
                entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao >= 0 && opcao <= 11) entradaValida = true;
                else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, tente novamente.");
            }
        }
        return opcao;
    }

    protected static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
        Contato contato;
        Random rd = new Random();
        for (int i = 1; i < quantidade; i++) {
            contato = new Contato();
            contato.setNome("Contato"+i);
            contato.setTelefone(String.valueOf(rd.nextInt(10)));
            contato.setEmail("contato"+i+"@email.com");
            lista.adiciona(contato);
        }
    }
}
