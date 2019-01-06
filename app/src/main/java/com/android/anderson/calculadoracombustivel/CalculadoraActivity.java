package com.android.anderson.calculadoracombustivel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity {

    private EditText gasolina;
    private EditText alcool;
    private Button botao;
    private TextView resultado;
    private Button botao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        gasolina = (EditText) findViewById(R.id.editTextGasolina);
        alcool = (EditText) findViewById(R.id.editTextAlcool);
        botao = (Button) findViewById(R.id.button);
        resultado = (TextView) findViewById(R.id.textResultado);
        botao2 = (Button) findViewById(R.id.buttonTela2);

        if(savedInstanceState != null){
            String melhorEscolha = savedInstanceState.getString("resultado");
            resultado.setText(melhorEscolha);
        }

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double gas =Double.parseDouble(gasolina.getText().toString());
                double alc = Double.parseDouble(alcool.getText().toString());
                String result = "";
                if((gas*0.7)> alc){
                    result = "Alcool";
                }else{
                    result = "Gasolina";
                }
                resultado.setText("A melhor opcao e: "+result);
            }
        });
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),SegundaActivity.class);
                i.putExtra("nome","Nilson");
                i.putExtra("qtdTurmas",3);
                startActivity(i);
            }
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle bundle){
        super.onSaveInstanceState(bundle);
        bundle.putString("resultado",resultado.getText().toString());
    }
}