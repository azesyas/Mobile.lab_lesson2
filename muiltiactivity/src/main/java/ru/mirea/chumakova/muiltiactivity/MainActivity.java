package ru.mirea.chumakova.muiltiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

   // private Object value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onMyButtonClick(View view){
        //Intent intent =new Intent(this,SecondActivity.class);
        //startActivity(intent);
        Intent intent =new Intent(MainActivity.this,SecondActivity.class);
        boolean value;
        value=true;
        intent.putExtra("key", value);
        startActivity(intent);

    }
    }

