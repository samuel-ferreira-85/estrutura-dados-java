package com.samuel.estruturadados.vetor;

public class VetorObject {

    private Object[] elementos;

//    o atributo tamanho serve para controlar o tamanho real do vetor
    private int tamanhoReal;

    public VetorObject(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanhoReal = 0;
    }

    //    Esse código é mais interessante porque não lança exceptions.
    //    se caso tentarmos adicionar mais elementos além do tamanho, não acontece nada, pois o retorno é um boolean.
    public boolean adiciona(Object elemento) {
        aumentarCapacidade();
        if (tamanhoReal < elementos.length) {
            elementos[tamanhoReal] = elemento;
            tamanhoReal++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, Object elemento) {
        verificaPosicao(posicao);
        aumentarCapacidade();
//        move todos os elementos até a posição repassada para que possa ser inserido o elemento
        for (int i = tamanhoReal -1; i >= posicao ; i--) {
            elementos[i + 1] = elementos[i];
        }
//      Insere o elemento na posição desejada
        elementos[posicao] = elemento;
        tamanhoReal++;
        return true;
    }

//    método busca o elemento pela posição
    public Object busca(int posicao) {
        verificaPosicao(posicao);
        return elementos[posicao];
    }

//    método retorna a posição em que se encontra o elemento, senão retorna -1
//    busca sequencial
    public int busca(Object elemento) {
        for (int i = 0; i < tamanhoReal; i++) {
            if (elementos[i].equals(elemento)) return i;
        }
        return -1;
    }
    
    public void remover(int posicao) {
        verificaPosicao(posicao);
        for (int i = posicao; i < tamanhoReal -1 ; i++) elementos[i] = elementos[i+1];
        tamanhoReal--;
    }

    public boolean remover(Object elemento) {
        int pos = busca(elemento);
        if (pos > 0) {
            remover(pos);
            return true;
        }
        return false;
    }

    private void aumentarCapacidade() {
        if (elementos.length == tamanhoReal) {
            Object[] elementosNovos = new Object[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) elementosNovos[i] = elementos[i];
            elementos = elementosNovos;
        }
    }

    //        Verificar se o que foi passado está fora do range de posições no vetor
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

    //    *** Não é um algortimo eficiente ***
//    public void adiciona(String elemento) {
//        for (int i = 0; i < elementos.length; i++) {
//            if (elementos[i] == null) {
//                elementos[i] = elemento;
//                break;
//            }
//        }
//    }

//    public void adiciona(String elemento) throws Exception {
//
////        para evitar erros, é importante verificar se o tamanho é menor que a capacidade de elementos do vetor
//        if (tamanho < elementos.length) {
//            elementos[tamanho] = elemento;
//            tamanho++;
//        } else {
//            throw new Exception("Não é possível adicionar elemento ao vetor, está cheio.");
//        }
//    }


}
