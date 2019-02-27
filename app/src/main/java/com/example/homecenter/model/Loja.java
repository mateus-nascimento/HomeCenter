package com.example.homecenter.model;

public class Loja {

    private final String nome;
    private final String local;

    public Loja(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }
}
