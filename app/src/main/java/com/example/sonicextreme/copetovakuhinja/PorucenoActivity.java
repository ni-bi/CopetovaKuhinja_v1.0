package com.example.sonicextreme.copetovakuhinja;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


/**
 * Created by Sonic.Extreme on 26-Jan-16.
 */
public class PorucenoActivity extends AppCompatActivity{

    private TextView mNaslov, mObrok, mZapopiti, mKomentar, mOvdeponeti, mTest;

    private  String obrok,zapopiti,komentar,ovdeponeti, test;


    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_poruceno);

        Intent intent=getIntent();
        obrok=intent.getStringExtra("MENI");
        zapopiti=intent.getStringExtra("KARTA");
        komentar=intent.getStringExtra("KOMENTAR");
        test=intent.getStringExtra("RADIO");

        init();
    }
    public void init() {
        mNaslov = (TextView) findViewById(R.id.naslov);
        mNaslov.getText();
        mNaslov.invalidate();
        mObrok = (TextView) findViewById(R.id.Jelo);
        mObrok.setText(obrok);
        mObrok.invalidate();
        mZapopiti = (TextView) findViewById(R.id.Pice);
        mZapopiti.setText(zapopiti);
        mZapopiti.invalidate();
        mKomentar = (TextView) findViewById(R.id.Komentar);
        mKomentar.setText("Komentar: "+komentar);
        mKomentar.invalidate();
        mOvdeponeti = (TextView) findViewById(R.id.Isporuka);
        mOvdeponeti.isShown();
        mOvdeponeti.invalidate();
        mTest = (TextView) findViewById(R.id.test);
        mTest.setText(test);
        mTest.invalidate();;
    }

}


