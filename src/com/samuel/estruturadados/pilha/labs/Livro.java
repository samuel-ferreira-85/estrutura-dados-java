package com.samuel.estruturadados.pilha.labs;

public class Livro {

    private String isbn;
    private String nome;
    private String anoLancamento;
    private String autor;

    public Livro() {
    }

    public Livro(String isbn, String nome, String anoLancamento, String autor) {
        this.isbn = isbn;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro {" +
                "isbn='" + isbn +
                ", nome='" + nome +
                ", anoLancamento='" + anoLancamento +
                ", autor='" + autor +
                "}\n";
    }
}
