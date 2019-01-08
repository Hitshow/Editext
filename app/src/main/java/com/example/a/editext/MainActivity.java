package com.example.a.editext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String st;
    EditText et;
    ImageButton ib;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView) findViewById(R.id.tv);
        et = (EditText) findViewById(R.id.et);

    }

    public void tapud(View view) {
        st=et.getText().toString();
        tv.setText(st);

    }
}
