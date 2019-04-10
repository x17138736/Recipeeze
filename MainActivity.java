package com.example.x17138736.recipeeze;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_italian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_italian = (Button) findViewById(R.id.btnItalian);

        btn_italian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Toast.makeText(getApplicationContext(),"Italian",Toast.LENGTH_LONG).show();

                Intent intent;
                intent = new Intent(getApplicationContext(), ItalianActivity.class);


                startActivity(intent);
            }
        });
    }
}
