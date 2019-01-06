package com.android.anderson.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.anderson.calculadoracombustivel.R;
import com.android.anderson.calculadoracombustivel.SegundaActivity;
import com.android.anderson.widgets.DatepickerActivity;
import com.android.anderson.widgets.ListViewActivity;
import com.android.anderson.widgets.WebViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button botaoListaView;
    private Button botaoWebView;
    private Button botaoDatepicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoListaView = (Button) findViewById(R.id.buttonListView);

        botaoListaView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ListViewActivity.class);
                startActivity(i);
            }
        });

        botaoWebView = (Button) findViewById(R.id.buttonWebView);

        botaoWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),WebViewActivity.class);
                startActivity(i);
            }
        });

        botaoDatepicker = (Button) findViewById(R.id.buttonDataPicker);

        botaoDatepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),DatepickerActivity.class);
                startActivity(i);
            }
        });
    }
}
