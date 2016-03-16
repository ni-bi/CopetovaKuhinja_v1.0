package com.example.sonicextreme.copetovakuhinja;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override

    protected void onPostCreate(Bundle SavedInstanceState) {
        super.onPostCreate(SavedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }
    public void addListenerOnButton(){
        button=(Button)findViewById(R.id.ulaz);
        final Context context=this;


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(context,PorucivanjeActivity.class);
                startActivity(intent);

            }


        });

    }


}
