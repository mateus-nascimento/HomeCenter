package com.example.homecenter.activity;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import com.example.homecenter.R;

import java.util.Calendar;

public class NovaCompraActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private Calendar mCalendar;
    private EditText mDataText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_compra);

        mDataText = (EditText) findViewById(R.id.data_nova_compra);
        mDataText.setText(getCurrentDate());
        mDataText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirCalendario();
            }
        });

    }

    private StringBuilder getCurrentDate() {
        mCalendar = Calendar.getInstance();

        StringBuilder builder = new StringBuilder();
        builder.append(mCalendar.get(Calendar.DAY_OF_MONTH));
        builder.append(".");
        builder.append(mCalendar.get(Calendar.MONTH));
        builder.append(".");
        builder.append(mCalendar.get(Calendar.YEAR));

        return builder;
    }

    private void abrirCalendario() {
        DatePickerDialog mDataPicker = new DatePickerDialog(this, this,
                mCalendar.get(Calendar.YEAR),
                mCalendar.get(Calendar.MONTH),
                mCalendar.get(Calendar.DAY_OF_MONTH));
        mDataPicker.show();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String dataEscolhida = dayOfMonth + "." + month + "." + year;
        mDataText.setText(dataEscolhida);
    }

}
