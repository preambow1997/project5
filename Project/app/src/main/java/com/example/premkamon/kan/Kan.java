package com.example.premkamon.kan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by premkamon on 24/8/2559.
 */
public class Kan extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kan_activity);


         Button b1 = (Button)findViewById(R.id.b1);
         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i = new Intent(getApplicationContext(), Menu1.class);
                 startActivity(i);
             }
         });


    }
}
