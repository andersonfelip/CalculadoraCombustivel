package com.android.anderson.calculadoracombustivel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText gasolina;
    private EditText alcool;
    private Button botao;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gasolina = (EditText) findViewById(R.id.editTextGasolina);
        alcool = (EditText) findViewById(R.id.editTextAlcool);
        botao = (Button) findViewById(R.id.button);
        resultado = (TextView) findViewById(R.id.textResultado);

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
                resultado.setText(result);
            }
        });


    }
}
