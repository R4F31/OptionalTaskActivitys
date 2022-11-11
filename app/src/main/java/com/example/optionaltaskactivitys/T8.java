package com.example.optionaltaskactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Date;

public class T8 extends AppCompatActivity  implements View.OnClickListener {
    Button btn;
    Button c_button;
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        setContentView(R.layout.t8);

        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(this);
        updateTime();



    }
    public void onClick(View view) {
        updateTime();
    }
    private void updateTime() {
        btn.setText(new Date().toString());
    }





}



