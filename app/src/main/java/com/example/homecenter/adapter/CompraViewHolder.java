package com.example.homecenter.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.homecenter.R;

public class CompraViewHolder extends RecyclerView.ViewHolder {

    final TextView nome;
    final TextView valor;
    final TextView local;
    final TextView data;

    public CompraViewHolder(@NonNull View itemView) {
        super(itemView);
        nome = (TextView) itemView.findViewById(R.id.nome_loja);
        valor = (TextView) itemView.findViewById(R.id.valor_compra);
        local = (TextView) itemView.findViewById(R.id.local_loja);
        data = (TextView) itemView.findViewById(R.id.data_compra);
    }
}
