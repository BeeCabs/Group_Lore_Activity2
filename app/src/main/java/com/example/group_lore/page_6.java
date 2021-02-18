package com.example.group_lore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class page_6 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_6);

        Button button = findViewById(R.id.button);
        TextView view = findViewById(R.id.textView4);

        button.setOnClickListener(this);

        view.setText("The cat sits still and looks at you with annoyance. " +
                "\nYou arrived in class late and failed every test and quiz that day. " +
                "\n   \n(Ending 2) ");


    }
    @Override
    public void onClick(View view){
        if (view.getId() == R.id.button) {
            Intent e = new Intent(page_6.this,MainActivity.class);
            startActivity(e);
        }


    }
}