package com.samuel.estruturadados.fila;

import com.samuel.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public boolean enfileira(T elemento) {
        return super.adiciona(elemento);
    }

    public T desenfileira() {
        if (this.estaVazia()) return null;

        T elemento = elementos[0];
        super.remove(0);
        return elemento;
    }

    public T espiar() {
        if (this.estaVazia()) return null;
        return super.elementos[0];
    }
}
