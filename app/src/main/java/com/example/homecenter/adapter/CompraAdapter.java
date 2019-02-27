package com.example.homecenter.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homecenter.R;
import com.example.homecenter.model.Compra;

import java.util.List;

public class CompraAdapter extends RecyclerView.Adapter {

    private List<Compra> compras;
    private Context context;

    public CompraAdapter(List<Compra> compras, Context context) {
        this.compras = compras;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_compra, parent, false);

        CompraViewHolder holder = new CompraViewHolder(view);

        return holder;
    }



    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder,
                                 int position) {
        CompraViewHolder holder = (CompraViewHolder) viewHolder;

        Compra compra = compras.get(position);

        holder.nome.setText(compra.getLoja().getNome());
        holder.valor.setText("R$ " + compra.getValor().toString());
        holder.data.setText(compra.getData().toString());
        holder.local.setText(compra.getLoja().getLocal());
    }

    @Override
    public int getItemCount() {
        return compras.size();
    }
}
