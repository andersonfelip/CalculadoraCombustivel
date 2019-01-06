package com.android.anderson.Native;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.anderson.calculadoracombustivel.R;

public class LigacaoActivity extends AppCompatActivity {

    EditText telefone;
    Button buttonLigar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ligacao);

        telefone = (EditText) findViewById(R.id.editTextTelefone);
        buttonLigar = (Button) findViewById(R.id.btnLigar);

        buttonLigar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = telefone.getText().toString();

                Uri uri = Uri.parse( "Telefone: "+ num );

                Intent intent = new Intent(Intent.ACTION_CALL, uri);

                if (ActivityCompat.checkSelfPermission(LigacaoActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(LigacaoActivity.this, new String[]{Manifest.permission.CALL_PHONE } ,1);
                    return;
                }
                startActivity(intent);


            }
        });
    }
}
