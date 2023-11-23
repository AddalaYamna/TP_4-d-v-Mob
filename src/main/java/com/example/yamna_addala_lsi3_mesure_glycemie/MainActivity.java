package com.example.yamna_addala_lsi3_mesure_glycemie;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yamna_addala_lsi3_mesure_glycemie.controller.controller;

public class MainActivity extends AppCompatActivity {
    private EditText etValeur ;
    private Button btnConsulter;
    private SeekBar sbAge;
    private RadioButton rbtOui , rbtNon;
    private TextView tvAge,tvResultat;
    private controller control  = controller.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //listener seekbar
        btnConsulter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculer(v);
            }
        });

        sbAge.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {

                Log.i("INFORMATION","onProgressChanged"+progress);
                tvAge.setText("Votre age="+progress);

            }
                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }


    });
    }

public void init()
        {
        etValeur =(EditText) findViewById(R.id.etValeur);
        sbAge = (SeekBar) findViewById(R.id.sbAge);
        btnConsulter =(Button) findViewById(R.id.btnConsulter);
        rbtOui=(RadioButton) findViewById(R.id.rbtOui);
        rbtNon=(RadioButton) findViewById(R.id.rbtNon);
        tvAge =(TextView) findViewById(R.id.tvAge);
        tvResultat =(TextView) findViewById(R.id.tvResultat);
        }
    public void calculer(View v){


    }
}
