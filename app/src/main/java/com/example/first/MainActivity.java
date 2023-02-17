package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends AppCompatActivity {
    int time = Toast.LENGTH_LONG; //длительность всплывающего окна
    Context context = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(context, "onCreate", time).show(); //создание текста Toast и вывод его на экран
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(context, "onStart", time).show(); //создание текста Toast и вывод его на экран
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(context, "onStop", time).show(); //создание текста Toast и вывод его на экран
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(context, "onPause", time).show(); //создание текста Toast и вывод его на экран
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(context, "onDestroy", time).show(); //создание текста Toast и вывод его на экран
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(context, "onResume", time).show(); //создание текста Toast и вывод его на экран
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(context, "onRestart", time).show(); //создание текста Toast и вывод его на экран
    }
}