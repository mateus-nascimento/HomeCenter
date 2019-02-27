package com.example.homecenter.model;

public class Produto {

    private final String nome;
    private final Double valor;
    private final Marca marca;

    public Produto(String nome, Double valor, Marca marca) {
        this.nome = nome;
        this.valor = valor;
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }

    public Marca getMarca() {
        return marca;
    }
}
