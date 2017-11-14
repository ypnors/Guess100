package com.example.user.guess100;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final EditText Number = (EditText) findViewById(R.id.number);
    private final Button Send = (Button) findViewById(R.id.send);
    private final TextView Secret = (TextView) findViewById(R.id.secret);
    private final TextView Info = (TextView)findViewById(R.id.info);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        EditText Number = (EditText) findViewById(R.id.number);
        Button Send = (Button) findViewById(R.id.send);
        TextView Secret = (TextView) findViewById(R.id.secret);
        TextView Info = (TextView)findViewById(R.id.info);
    }

    public void send(View view){
        int num=(int)(Math.random()*100)+1;
        TextView Number=(TextView)findViewById(R.id.secret);
        Button Send = (Button) findViewById(R.id.send);
        TextView Secret = (TextView) findViewById(R.id.secret);
        TextView Info = (TextView)findViewById(R.id.info);
        Secret.setText("隨機數字"+String.valueOf(num));
        if(Number<num){
            Toast.makeText(this,"小於",Toast.LENGTH_LONG).show();
        }
        else if(Number>num){
            Toast.makeText(this,"大於",Toast.LENGTH_LONG).show();
        }
        else {
            new AlertDialog.Builder(this)
                    .setMessage("對")
                    .setTitle("正確")
                    .setPositiveButton("OK",null)
                    .show();
        }
    }
}
