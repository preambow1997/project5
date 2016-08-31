package com.example.premkamon.kan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by premkamon on 25/8/2559.
 */
public class Menu1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), Text.class);
                startActivity(a);
            }
        }

        );

    }
}