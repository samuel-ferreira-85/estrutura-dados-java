package com.samuel.estruturadados.pilha;

import com.samuel.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public boolean empilha(T elemento) {
        return super.adiciona(elemento);
    }

    public T desempilhar() {
        if (this.estaVazia()) return null;

        return this.elementos[--tamanho];
    }

    public T topo() {
        if(this.estaVazia()) return null;

        return super.elementos[tamanho - 1];
    }
}
