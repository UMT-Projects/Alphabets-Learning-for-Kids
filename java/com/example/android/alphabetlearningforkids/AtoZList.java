package com.example.android.alphabetlearningforkids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AtoZList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ato_zlist);
    }

    public void sendtoLesson(View view){


        Intent i = new Intent(this, Lesson.class);
        startActivity(i);
    }
}
