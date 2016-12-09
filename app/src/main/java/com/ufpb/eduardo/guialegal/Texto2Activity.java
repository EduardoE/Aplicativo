package com.ufpb.eduardo.guialegal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.TextView;

public class Texto2Activity extends AppCompatActivity {
    private ScrollView scrollView2;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texto2);

        textView2 = (TextView)findViewById(R.id.texto2);
        scrollView2 = (ScrollView)findViewById(R.id.scroll_view2);

        textView2.setText(Texto.getTexto2());
        textView2.setTextSize(14);
    }


}
