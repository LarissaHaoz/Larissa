package com.hockeyli.larissa.insect;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


import com.hockeyli.larissa.MainActivity;
import com.hockeyli.larissa.R;

/**
 * @author Larissa
 * @date 2019/5/20
 */
public class WatermelonActivity extends AppCompatActivity {
    Button mBtnOnClick;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watermelon);
        mBtnOnClick = findViewById(R.id.watermelon_btn_onClick);
        mBtnOnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WatermelonActivity.this, MainActivity.class);
                intent.putExtra("info", "This is WatermelonActivity");
                intent.putExtra("number", 5);

                startActivity(intent);
            }
        });

    }
}
