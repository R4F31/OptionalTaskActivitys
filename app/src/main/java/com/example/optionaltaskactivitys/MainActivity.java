package com.example.optionaltaskactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Date;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    Button btn;
    Button n_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btn=new Button(this);
        btn.setOnClickListener(this);
        updateTime();
        setContentView(btn);
    }
    public void onClick(View view) {
        updateTime();
    }
    private void updateTime() {
        btn.setText(new Date().toString());
    }
}
