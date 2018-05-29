package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;

public class Who_a_u extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_a_u);

        ImageButton btn_go1 = (ImageButton) findViewById(R.id.mbutton1);
        btn_go1.setOnClickListener(
            new Button.OnClickListener() {
                public void onClick (View v) {
                    Intent intent = new Intent(getApplicationContext(), Who_second.class);
                    startActivity(intent);
                }
            }
        );

        final EditText edittext=(EditText)findViewById(R.id.Redittext1);
        final EditText edittext1=(EditText)findViewById(R.id.Redittext2);

        ImageButton btn_go2 = (ImageButton) findViewById(R.id.mbutton4);
        btn_go2.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick (View v) {
                        Intent intent1 = new Intent(getApplicationContext(), Who_menu_one.class);
                        startActivity(intent1);
                    }
                }
        );
    }
}
//2