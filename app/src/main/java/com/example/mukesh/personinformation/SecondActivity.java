package com.example.mukesh.personinformation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView nameTextView = null;
    private TextView phoneTextView = null;
    private TextView addressTextView = null;
    private TextView urlTextView = null;

    private Person data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //get data from intent
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        data = (Person) bundle.getSerializable("data");

        //wire and populate the fields with data.getName() etc
        nameTextView = findViewById(R.id.textViewName);
        phoneTextView = findViewById(R.id.textViewPhone);
        addressTextView = findViewById(R.id.textViewAddr);
        urlTextView = findViewById(R.id.textViewUrl);

        nameTextView.setText(data.getName());
        phoneTextView.setText(data.getPhone());
        addressTextView.setText(data.getAddress());
        urlTextView.setText(data.getUrl());

        //deal with button
    }
}
