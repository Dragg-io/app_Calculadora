package com.lucas_silva.lucas.menunavigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ControladorTelaOperacoes extends AppCompatActivity {
    //DECLARAÇÃO DAS VARIAVEIS DE COMPONENTES
    EditText edtValor1, edtValor2;
    TextView txvResultado;
    Button btnSomar, btnSubtrair;

    //TRÊS VARIAVEIS PARA CALCULOS
    double valor1, valor2, resultado;

    protected void abrirTela(Context tela, Class novaTela){
        Intent intent = new Intent(tela, novaTela);
        this.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_operacoes);



        //ASSOCIAÇÃO DOS COMPONENTES E VARIAVEIS
        edtValor1 = (EditText) findViewById(R.id.inputValor1);
        edtValor2 = (EditText) findViewById(R.id.inputValor2);
        txvResultado = (TextView) findViewById(R.id.txtResultado);

        //ASSOCIAÇÃO BOTÕES
        btnSomar = (Button) findViewById(R.id.btnSoma);
        btnSubtrair = (Button) findViewById(R.id.btnSubtrai);

        //Adicionar a Programação de Botões no evento de Clique
        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());
                resultado = (valor1 + valor2);
                txvResultado.setText(String.valueOf(resultado));
            }
        });


        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());
                resultado = (valor1 - valor2);
                txvResultado.setText(String.valueOf(resultado));
            }
        });
    }




}
