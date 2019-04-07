package com.example.homecenter.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homecenter.R;
import com.example.homecenter.activity.NovaCompraActivity;
import com.example.homecenter.adapter.CompraAdapter;
import com.example.homecenter.model.Compra;
import com.example.homecenter.model.Loja;
import com.example.homecenter.model.Marca;
import com.example.homecenter.model.Produto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ComprasFragment extends Fragment {

    private RecyclerView recyclerView;

    public ComprasFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_compras, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = (RecyclerView) getActivity().findViewById(R.id.recycler_view);

        //Teste
        Marca marca = new Marca("Arno");
        Produto produto = new Produto("ventilador", 189.90, marca);
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        produtos.add(produto);
        Loja loja = new Loja("Extra", "Rua Paes de Barros");

        //Data
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date parse = null;
        String data = null;
        try {
            parse = formatter.parse("17/12/2007 19:30:20");
            data = formatter.format(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        Compra compra = new Compra(data, 189.90, loja, produtos);
        ArrayList<Compra> compras= new ArrayList<Compra>();
        compras.add(compra);
        compras.add(compra);
        compras.add(compra);

        recyclerView.setAdapter(new CompraAdapter(compras, getContext()));

        RecyclerView.LayoutManager layout = new LinearLayoutManager(getContext(),
                LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layout);

        FloatingActionButton fab = getActivity().findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent intent = new Intent(getActivity(), NovaCompraActivity.class);
                startActivity(intent);
            }
        });
    }
}
