package com.ufpb.eduardo.guialegal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class Texto3Activity extends AppCompatActivity {

    ScrollView scrollView3;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texto3);


        scrollView3 = (ScrollView)findViewById(R.id.scroll_view3);

        textView3 = (TextView)findViewById(R.id.texto3);
        textView3.setText(Texto.getTexto3());
        textView3.setTextSize(14);

    }
}
