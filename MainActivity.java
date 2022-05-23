package com.example.swproject02;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //인텐트(화면전환) 쓸 때 덮어 쓸 변수 선언.
    private Button btn_move;

    //팝업을 띄울 때 쓸 버튼, 조건문으로 모조리 변경해야 함.
    Button btn_popup;

    //팝업 자체 변수, 덮어 쓸 예정.
    Dialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //resFind01
        btn_popup = findViewById(R.id.btn_res_find01); //재정의함
        mDialog = new Dialog(this);
        //여기 DB 연동시키고 조건문으로 써야 함.
        btn_popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.setContentView(R.layout.yeab_app_resfind01_pop);
                mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                Intent intent = new Intent(MainActivity.this, yeab_app_resFind01.class);
            }
        });

    }
}