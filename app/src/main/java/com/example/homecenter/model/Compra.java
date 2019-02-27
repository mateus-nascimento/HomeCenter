package com.example.homecenter.model;

import java.util.Date;
import java.util.List;

public class Compra {
    private final Date data;
    private final Double valor;
    private final Loja loja;
    private final List<Produto> produtos;

    public Compra(Date data, Double valor, Loja loja, List<Produto> produtos) {
        this.data = data;
        this.valor = valor;
        this.loja = loja;
        this.produtos = produtos;
    }

    public Date getData() {
        return data;
    }

    public Double getValor() {
        return valor;
    }

    public Loja getLoja() {
        return loja;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
