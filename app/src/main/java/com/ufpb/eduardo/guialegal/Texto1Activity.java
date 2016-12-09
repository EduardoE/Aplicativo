package com.ufpb.eduardo.guialegal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;


public class Texto1Activity extends AppCompatActivity {
    private ScrollView scrollView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texto1);

        scrollView = (ScrollView)findViewById(R.id.scroll_view);
        textView = (TextView)findViewById(R.id.text);

        textView.setText(Texto.getTexto1());
        textView.setTextSize(14);
    }
}
