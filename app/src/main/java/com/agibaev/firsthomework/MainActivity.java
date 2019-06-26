package com.agibaev.firsthomework;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView firstText = findViewById(R.id.main_frst_txt);
        Button buttonOk = findViewById(R.id.main_btnOk);
        Button buttonCancel = findViewById(R.id.main_btnCancel);

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstText.setText("Нажата кнопка Ok");
            }
        });

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstText.setText("Жми на кнопку");
            }
        });
    }
}
