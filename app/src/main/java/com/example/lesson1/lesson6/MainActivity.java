package com.example.lesson1.lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.lesson1.lesson6.Adapter.GameAdapter;
import com.example.lesson1.lesson6.Data.GameClient;
import com.example.lesson1.lesson6.Data.GameModel;
import com.example.lesson1.lesson6.Interface.OnItemClicklistener;
import com.example.lesson1.lesson6.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    GameAdapter gameAdapter;
    ArrayList<GameModel> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialization();
        listener();
    }


    private void initialization() {
        list = GameClient.getGameList();
        gameAdapter = new GameAdapter(list );
        binding.recyclerView.setAdapter(gameAdapter);
        list = GameClient.getGameList();

    }
    private void listener() {
        gameAdapter.setOnItemClicklistener(new OnItemClicklistener() {
            @Override
            public void onItemClick(GameModel gameModel) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("key",gameModel);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        list.clear();
    }
}