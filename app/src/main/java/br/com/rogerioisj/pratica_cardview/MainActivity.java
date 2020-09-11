package br.com.rogerioisj.pratica_cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import br.com.rogerioisj.pratica_cardview.adapters.CardviewAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mainRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainRecycler = findViewById(R.id.main_recycler);

        //Definir Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        mainRecycler.setLayoutManager(layoutManager);
        mainRecycler.setHasFixedSize(true);

        //Definir Adapter
        CardviewAdapter cardviewAdapter = new CardviewAdapter();
        mainRecycler.setAdapter(cardviewAdapter);
    }
}