package com.android.anderson.widgets;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SearchView;
import android.widget.Toast;

import com.android.anderson.calculadoracombustivel.R;

public class SearchViewActivity extends AppCompatActivity {

    private SearchView svPesquisar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);

        svPesquisar = findViewById(R.id.svPesquisar);

        svPesquisar.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                Toast.makeText(SearchViewActivity.this, "Texto pesquisado:"+query, Toast.LENGTH_LONG).show();

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }

}
