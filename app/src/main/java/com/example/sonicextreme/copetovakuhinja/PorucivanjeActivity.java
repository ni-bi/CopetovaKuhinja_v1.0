package com.example.sonicextreme.copetovakuhinja;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;

import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by Sonic.Extreme on 26-Jan-16.
 */
public class PorucivanjeActivity extends AppCompatActivity{

    ImageButton mSlika;
    CheckBox checkbox1, checkbox2, checkbox3, checkbox4;
    EditText mKomentar;

    RadioGroup mOvdeponeti, radioGroup;
    RadioButton rb1,rb2, radioButton;



    @Override
    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_porucivanje);
        Init();
        addListener();
    }

    private void Init() {
        checkbox1=(CheckBox)findViewById(R.id.checkbox1);
        checkbox2=(CheckBox)findViewById(R.id.checkbox2);
        checkbox3=(CheckBox)findViewById(R.id.checkbox3);
        checkbox4=(CheckBox)findViewById(R.id.checkbox4);
        mKomentar=(EditText)findViewById(R.id.komentar);
        rb1 = (RadioButton)findViewById((R.id.rb1));
        rb2 = (RadioButton)findViewById((R.id.rb2));
        mSlika=(ImageButton)findViewById(R.id.img2);
        mOvdeponeti = (RadioGroup)findViewById(R.id.radioGroup);

    }



    public  void addListener(){

        mOvdeponeti.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Intent i = new Intent(PorucivanjeActivity.this, PorucenoActivity.class);

                if (checkedId == R.id.rb1)
                    rb1.getText().toString();
                else
                    rb2.getText().toString();


            }
        });
        mSlika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PorucivanjeActivity.this, PorucenoActivity.class);

//izbor za hranu

                String obrok;
                if (checkbox1.isChecked() && checkbox2.isChecked())
                    obrok = checkbox1.getText().toString() + "\n" + checkbox2.getText().toString();
                else if (checkbox1.isChecked())
                    obrok = checkbox1.getText().toString();
                else if (checkbox2.isChecked())
                    obrok = checkbox2.getText().toString();
                else
                    obrok = "Bez obroka";
                intent.putExtra("MENI", obrok);

//izbor za piće

                String za_popiti;
                if (checkbox3.isChecked() && checkbox4.isChecked())
                    za_popiti = checkbox3.getText().toString() + "\n" + checkbox4.getText().toString();
                else if (checkbox4.isChecked())
                    za_popiti = checkbox4.getText().toString();
                else if (checkbox3.isChecked())
                    za_popiti = checkbox3.getText().toString();
                else
                    za_popiti = "Bez pića";

                intent.putExtra("KARTA", za_popiti);
//Komentar
                String Komentar;
                if (mKomentar.length() > 0)
                    Komentar = mKomentar.getText().toString();
                else
                    Komentar = "Bez dodatnog komentara";
                intent.putExtra("KOMENTAR", Komentar);


                int test= mOvdeponeti.getCheckedRadioButtonId();

                if(test == rb1.getId())
                    rb1.setText("Za ovde");
                 else
                    rb2.setText("Za poneti");

                intent.putExtra("RADIO", test);

                startActivity(intent);
                }






        });
        }}






