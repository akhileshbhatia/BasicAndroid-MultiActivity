package com.example.mukesh.personinformation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView personImageView = null;
    private Button moreInfoButton = null;
    private PersonData data = new PersonData();
    private Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //wire
        personImageView = findViewById(R.id.imageViewPerson);
        moreInfoButton = findViewById(R.id.buttonMoreInfo);

        //set the image from data.image
        int imageResId = getResources().getIdentifier(data.getPersonData().getImage(),"drawable",getPackageName());
        personImageView.setImageResource(imageResId);

        moreInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,SecondActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("data",data.getPersonData());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
