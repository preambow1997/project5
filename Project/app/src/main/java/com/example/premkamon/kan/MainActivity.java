package com.example.premkamon.kan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtName = (EditText)findViewById(R.id.editText2);
        final EditText txtName1 = (EditText)findViewById(R.id.editText);

        final Button subMitfrm = (Button)findViewById(R.id.btn);

        final TextView ShowMsg = (TextView) findViewById(R.id.textView);
        final TextView ShowMsg1 = (TextView) findViewById(R.id.textView3);

        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Select.class);
                startActivity(i);


            }
        });
    }
}