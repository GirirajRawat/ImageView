package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private RadioButton rbtna,rbtnb,rbtnc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbtna=findViewById(R.id.rbtna);
        rbtnb=findViewById(R.id.rbtnb);
        rbtnc=findViewById(R.id.rbtnc);
    }
}
