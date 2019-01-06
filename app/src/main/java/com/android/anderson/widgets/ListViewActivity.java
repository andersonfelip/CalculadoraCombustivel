package com.android.anderson.widgets;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import com.android.anderson.calculadoracombustivel.R;

public class ListViewActivity extends AppCompatActivity {

    EditText edt = null;
    ArrayList<String> contatos = null;
    ArrayAdapter<String> adapter = null;
    private Button botaoAdicionar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        botaoAdicionar = (Button) findViewById(R.id.button);
        contatos = new ArrayList<String>();
        edt = (EditText)findViewById(R.id.editText1);
        ListView listView = (ListView)findViewById(R.id.listView1);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, contatos);
        listView.setAdapter(adapter);
    }

    public void meuBotaoClick(View v){
        contatos.add(edt.getText().toString());
        edt.setText("");
        adapter.notifyDataSetChanged();
    }

}
