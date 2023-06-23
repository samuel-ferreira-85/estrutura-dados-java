package com.samuel.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {

    private T[] elementos;

    private int tamanhoReal;


    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade]; // solução do livro java efetivo
    }

    public Lista(int capacidade, Class<T> tipoClass) {
        this.elementos = (T[]) Array.newInstance(tipoClass, capacidade); // utilizando reflect
        this.tamanhoReal = 0;
    }

    public boolean adiciona(T elemento) {
        aumentarCapacidade();
        if (tamanhoReal < elementos.length) {
            elementos[tamanhoReal] = elemento;
            tamanhoReal++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, T elemento) {
        verificaPosicao(posicao);
        aumentarCapacidade();
        for (int i = tamanhoReal -1; i >= posicao ; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanhoReal++;
        return true;
    }

    public T obtem(int posicao) {
        return busca(posicao);
    }

    public T busca(int posicao) {
        verificaPosicao(posicao);
        return elementos[posicao];
    }

    public int busca(T elemento) {
        for (int i = 0; i < tamanhoReal; i++) {
            if (elementos[i].equals(elemento)) return i;
        }
        return -1;
    }

    public boolean contem(T elemento) {
        return busca(elemento) >= 0;
    }

    public int ultimoIndice(T elemento) {
        for (int i = tamanhoReal - 1; i >= 0 ; i--) {
            if (elementos[i].equals(elemento)) return i;
        }
        return -1;
    }
    
    public void remover(int posicao) {
        verificaPosicao(posicao);
        for (int i = posicao; i < tamanhoReal -1 ; i++) elementos[i] = elementos[i+1];
        tamanhoReal--;
    }

    public boolean remover(T elemento) {
        int pos = busca(elemento);
        if (pos > 0) {
            remover(pos);
            return true;
        }
        return false;
    }

    public void limpar() {
        // opção 1
//        elementos = (T[]) new Object[elementos.length];

        // opção 2
//        tamanhoReal = 0;

        // opção 3
        for (int i = 0; i < tamanhoReal; i++) {
            elementos[i] = null;
        }
        tamanhoReal = 0;
    }

    private void aumentarCapacidade() {
        if (elementos.length == tamanhoReal) {
            T[] elementosNovos = (T[]) new Object[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) elementosNovos[i] = elementos[i];
            elementos = elementosNovos;
        }
    }

    private void verificaPosicao(int posicao) {
        if (!(posicao >= 0 && posicao < tamanhoReal)) {
            throw new IllegalArgumentException("Posição inválida.");
        }
    }


    public int getTamanhoReal() {
        return tamanhoReal;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < tamanhoReal-1; i++) {
            s.append(elementos[i]);
            s.append(", ");
        }
        if (tamanhoReal > 0) s.append(elementos[tamanhoReal - 1]);
        s.append("]");
        return s.toString();
    }

}
