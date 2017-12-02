package com.erizzocreations.buttonexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private int counter=0;
    private TextView tv;
    private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Asocias la vista en función del layout diseñado, en este caso activity_main
        setContentView(R.layout.activity_main);

        //Bindas los elementos de la vista. El botón y el TextView
        tv = (TextView) findViewById(R.id.TV_increment);
        bt = (Button) findViewById(R.id.BT_increment);

        //Implementas el método onClickListener del botón
        bt.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        //Defines la acción que vas a hacer al pulsar el botón. En este caso incrementar un contador y pintarlo
        counter++;//Incrementas el contador +1 cada vez que pulses
        tv.setText(String.valueOf(counter)); //pintas el resultado en el textview

    }
}
