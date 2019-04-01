package com.example.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private RadioButton rbtna,rbtnb,rbtnc;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbtna=findViewById(R.id.rbtna);
        rbtnb=findViewById(R.id.rbtnb);
        rbtnc=findViewById(R.id.rbtnc);
        imageView=findViewById(R.id.imageview);

        rbtna.setOnClickListener(this);
        rbtnb.setOnClickListener(this);;
        rbtnc.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rbtna:
                // Toast.makeText(this,"Rajesh",Toast.LENGTH_LONG).show();
                imageView.setImageResource(R.drawable.a);

                break;
            case R.id.rbtnb:
                // Toast.makeText(this,"Gurkhas",Toast.LENGTH_LONG).show();
                imageView.setImageResource(R.drawable.b);

                break;
            case R.id.rbtnc:
                 //Toast.makeText(this,"RjsBodyBuilder",Toast.LENGTH_LONG).show();
                imageView.setImageResource(R.drawable.c);
                break;

        }
    }
}
