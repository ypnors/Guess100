package com.example.user.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
}
