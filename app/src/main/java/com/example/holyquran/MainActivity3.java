package com.example.holyquran;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView verseTextView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        verseTextView = findViewById(R.id.verseT);

        // Get the selected verse from the intent
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String selectedVerse = extras.getString("selectedVerse");
            verseTextView.setText(selectedVerse);
        }
    }
}
