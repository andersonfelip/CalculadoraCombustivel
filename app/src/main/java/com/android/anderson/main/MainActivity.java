package com.android.anderson.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.anderson.Native.CameraActivity;
import com.android.anderson.Native.LigacaoActivity;
import com.android.anderson.Native.ShareActivity;
import com.android.anderson.calculadoracombustivel.R;
import com.android.anderson.widgets.DatepickerActivity;
import com.android.anderson.widgets.ImageViewActivity;
import com.android.anderson.widgets.ListViewActivity;
import com.android.anderson.widgets.WebViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button botaoListaView;
    private Button botaoWebView;
    private Button botaoDatepicker;
    private Button botaoImageView;
    private Button botaoLigacao;
    private Button botaoCamera;
    private Button botaoCompartilhar;

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

        botaoImageView = (Button) findViewById(R.id.buttonImageView);

        botaoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ImageViewActivity.class);
                startActivity(i);
            }
        });


        botaoLigacao = (Button) findViewById(R.id.buttonLigacao);

        botaoLigacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),LigacaoActivity.class);
                startActivity(i);
            }
        });

        botaoCamera = (Button) findViewById(R.id.buttonCamera);

        botaoCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),CameraActivity.class);
                startActivity(i);
            }
        });

        botaoCompartilhar = (Button) findViewById(R.id.buttonCompartilhar);

        botaoCompartilhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ShareActivity.class);
                startActivity(i);
            }
        });
    }
}
