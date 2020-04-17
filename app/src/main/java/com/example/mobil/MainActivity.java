package com.example.mobil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String title = "Mode List";
    private RecyclerView rvMobil;
    private ArrayList<mobil> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvMobil = findViewById(R.id.rv_mobil);
        rvMobil.setHasFixedSize(true);

        list.addAll(data_mobil.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvMobil.setLayoutManager(new LinearLayoutManager(this));
        Listmobil_Adapter listmobil_adapter = new Listmobil_Adapter(list);
        rvMobil.setAdapter(listmobil_adapter);
    }

    private void showRecyclerGrid(){
        rvMobil.setLayoutManager(new GridLayoutManager(this, 2));
        GridMobilView gridMobilView = new GridMobilView(list);
        rvMobil.setAdapter(gridMobilView);

    }

    private void showRecyclerCardView(){
        rvMobil.setLayoutManager(new LinearLayoutManager(this));
        CardViewMobilAdapter cardViewMobilAdapter = new CardViewMobilAdapter(list);
        rvMobil.setAdapter(cardViewMobilAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;

            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
                break;

            case R.id.action_cardview:
                title = "Mode CardView";
                showRecyclerCardView();
                break;
        }
        setActionBarTitle(title);
    }

        private void setActionBarTitle(String title) {
            if (getSupportActionBar() != null) {
                getSupportActionBar().setTitle(title);
            }
        }

        private void shoewSelectedMobil (mobil mobil){
            Toast.makeText(this,"kamu memilih " + mobil.getName(), Toast.LENGTH_SHORT).show();
    }
}
