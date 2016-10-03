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
 * Created by premkamon on 24/8/2559.
 */
public class Select extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);


        final EditText txtName = (EditText) findViewById(R.id.editText2);
        final EditText txtName1 = (EditText) findViewById(R.id.editText);

        final Button subMitfrm = (Button) findViewById(R.id.btn);

        final TextView ShowMsg = (TextView) findViewById(R.id.textView);
        final TextView ShowMsg1 = (TextView) findViewById(R.id.textView3);


        Button.setOnClickListener(new View.OnClickListener() {
public void onClick(View v) {
if (mClient == null) {
AlertDialog ad = adb.create();
ad.setMessage("Cannot connect to Windows Azure Mobile Service!");
 ad.show();
} else {
mMyMember.where().field("username").eq(txtName.getText().toString()).and()
    .field("password").eq(txtName1.getText().toString())
.execute(new TableQueryCallback<MyMember>() {
public void onCompleted(List<MyMember> result,
if (exception == null) { int count, Exception exception,
        ServiceFilterResponse response) {
if(result.size() > 0)
{
int id = 0;
/*String username = null;

String password = null;

String name = null;

String tel = null;

String email = null;*/
MyMember item = result.get(0);
id = item.getId();
/*username = item.getUsername();

password = item.getPassword();

name = item.getName();

tel = item.getTel();

email = item.getEmail();*/
Intent newActivity = new Intent(MainActivity.this,DetailActivity.class);
newActivity.putExtra("sid", id);
startActivity(newActivity);
}
else
{
AlertDialog ad = adb.create();
ad.setMessage("Incorrect Username and Password!");
ad.show();
}
} else {
AlertDialog ad = adb.create();
ad.setMessage("Error : " + exception.getCause().getMessage());
ad.show();



         Button b1 = (Button)findViewById(R.id.b1);
         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i = new Intent(getApplicationContext(), Menu1.class);
                 startActivity(i);
             }
         });

        Button b2 = (Button)findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Menu2.class);
                startActivity(i);
            }
        });

        Button b3 = (Button)findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Menu3.class);
                startActivity(i);
            }
        });


    }
}
