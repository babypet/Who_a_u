package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageButton;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.Menu;
import android.app.Activity;

public class Who_menu_one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_second);

        final EditText edittext=(EditText)findViewById(R.id.Eedittext1);
        final EditText edittext1=(EditText)findViewById(R.id.Eedittext2);
        Button button=(Button)findViewById(R.id.Einsert1);

        //final TextView textView=(TextView)findViewById(R.id.Eoutput1);
        //final TextView textView1=(TextView)findViewById(R.id.Eoutput2);

       /* button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(edittext.getText());
                textView1.setText(edittext1.getText());
                edittext.setText(null);
                edittext.setHint(null);
                edittext1.setText(null);
                edittext1.setHint(null);
            }
        });*/
        //Intent Eintent = new Intent(Who_menu_one.this,Who_second.class);
        Intent intent = getIntent();
        if(intent.getAction().equals("kr.co.hta.MyAction")) {
            //호출한 인텐트가 보내온 이미지와 메시지 얻어오기
            Bitmap bitmap = (Bitmap) intent.getExtras().get("img");
            String msg = (String) intent.getExtras().get("msg");

            //전달 되어온 정보를 뷰에 넣기기
            TextView txt = (TextView) findViewById(R.id.Eoutput1);
            txt.setText(msg);
            ImageButton img = (ImageButton) findViewById(R.id.Ebutton1);
            img.setImageBitmap(bitmap);
        }
    }
}
//3