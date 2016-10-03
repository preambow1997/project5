package com.example.premkamon.kan;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by premkamon on 25/8/2559.
 */
public class Menu1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

    private void refreshItemsFromTable(final int id) {
        final AlertDialog.Builder adb = new AlertDialog.Builder(this);
        if (mClient == null) {
            AlertDialog ad = adb.create();
            ad.setMessage("Cannot connect to Windows Azure Mobile Service!");
            ad.show();
        } else {

            mMyMember.where().field("id").eq(id).execute(new TableQueryCallback<MyMember>() {
            public void onCompleted(List<MyMember> result, int count, Exception exception,
                      ServiceFilterResponse response) {
                if (exception == null) {
                    066.
                    if(result.size() > 0)
                    {
                        final EditText txtName = (EditText) findViewById(R.id.editText2);
                        final EditText txtName1 = (EditText) findViewById(R.id.editText);

                        final Button subMitfrm = (Button) findViewById(R.id.btn);

                        final TextView ShowMsg = (TextView) findViewById(R.id.textView);
                        final TextView ShowMsg1 = (TextView) findViewById(R.id.textView3);
                    }

            } else {
                    AlertDialog ad = adb.create();
                    ad.setMessage("Error : " + exception.getCause().getMessage());
                    ad.show();
                }
        }
    };


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), Text.class);
                startActivity(a);
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), Text1.class);
                startActivity(a);
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), Text2.class);
                startActivity(a);
            }
        });
    }


    }
