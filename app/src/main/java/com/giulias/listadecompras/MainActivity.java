package com.giulias.listadecompras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder= new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mViewHolder.addListaButton= (Button)findViewById(R.id.button_add_lista);
        this.mViewHolder.addListaButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id= view.getId();
        if (id==R.id.button_add_lista){
            //this.mViewHolder.addListaButton.setText("Bombou!");
        }
    }


    private static class ViewHolder{

        Button addListaButton;


    }
}