package com.example.user.myapplication;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageButton;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.content.Intent;
import android.view.Menu;

public class Who_second extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_second);

        final EditText edittext=(EditText)findViewById(R.id.Redittext1);
        final EditText edittext1=(EditText)findViewById(R.id.Redittext2);
        final Button button=(Button)findViewById(R.id.Rinsert1);
        final Button button1 = (Button)findViewById(R.id.Rclose);
        final TextView textView=(TextView)findViewById(R.id.Routput1);
        final TextView textView1=(TextView)findViewById(R.id.Routput2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = edittext.getText().toString();
                //이미지를 비트맵 객체로 만들기 기기기
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.id.Rbutton1);

                //다른 엑티비티를 호출하기 위한 인텐트 생성하기.
                Intent intent = new Intent();

                //액션이름으로 호출하기(암시적 인텐트)
                intent.setAction("kr.co.hta.MyAction");

                //호출되는 액션에 보낼 부가정보 담기.
                intent.putExtra("msg",str);
                intent.putExtra("img",bitmap);

                startActivity(intent);//인텐트전송
            }
        });
        button1.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick (View v) {
                        Intent intent = new Intent(getApplicationContext(), Who_a_u.class);
                        startActivity(intent);
                    }
                }
        );
    }
}
//4