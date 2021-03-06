package com.android.anderson.Native;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import com.android.anderson.calculadoracombustivel.R;
import com.android.anderson.main.MainActivity;

public class MainContatoActivity extends AppCompatActivity {

    ListView listViewContatos;
    Button conects;
    Button tela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_contato);
        listViewContatos = (ListView) findViewById(R.id.listView1);
        conects = (Button) findViewById(R.id.conects);
        tela2 = (Button) findViewById(R.id.tela2);

        tela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(it);
            }
        });

        conects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View va) {
                ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
                NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
                String s = "Conexão";
                if(wifi.isConnected()){
                    s += " Wi-fi";
                }else if (mobile.isConnected()){
                    s += " Móvel";
                }else{
                    s = "Sem conexão";
                }
                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
            }});

    }

    public void get(View v){
        Cursor cursor = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                null,null,null,null);
        startManagingCursor(cursor);

        String[] from = {ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME,ContactsContract.CommonDataKinds.Phone.NUMBER,
                ContactsContract.CommonDataKinds.Phone._ID};

        int[] to = {android.R.id.text1, android.R.id.text2};

        SimpleCursorAdapter simpleCursorAdapter = new SimpleCursorAdapter(getApplicationContext(), android.R.layout.simple_list_item_2, cursor, from, to);
        listViewContatos.setAdapter(simpleCursorAdapter);
        listViewContatos.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.menu_item_share) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
