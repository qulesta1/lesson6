package com.example.lesson1.lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.lesson1.lesson6.Data.GameModel;
import com.example.lesson1.lesson6.databinding.ActivityMainBinding;
import com.example.lesson1.lesson6.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;
    GameModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialization();
        setOnClick();
    }

    private void setOnClick() {
        binding.btnImageOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!model.getAnswerCorrect().equals(model.getAnswerOne())) {
                    Toast.makeText(SecondActivity.this, "не правильно", Toast.LENGTH_SHORT).show();
                }
            }
        });


        binding.btnImageTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!model.getAnswerCorrect().equals(model.getAnswerTwo())) {
                    Toast.makeText(SecondActivity.this, "не правильно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.btnImageThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!model.getAnswerCorrect().equals(model.getAnswerThree())) {
                    Toast.makeText(SecondActivity.this, "не правильно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        binding.btnImageFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (model.getAnswerCorrect().equals(model.getAnswerFour())) {
                    Toast.makeText(SecondActivity.this, "правильно", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void initialization() {
        model = (GameModel) getIntent().getSerializableExtra("key");
        binding.tvText.setText(model.getQiuz());
        binding.btnImageOne.setText(model.getAnswerOne());
        binding.btnImageTwo.setText(model.getAnswerTwo());
        binding.btnImageThree.setText(model.getAnswerThree());
        binding.btnImageFour.setText(model.getAnswerFour());
    }
}