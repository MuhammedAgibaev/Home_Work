package com.agibaev.firsthomework;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView firstText = findViewById(R.id.main_frst_txt);
        Button buttonOk = findViewById(R.id.main_btnOk);

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (status){
                    firstText.setText("Нажата кнопка ОК");
                    status = false;
                }else
                {
                    firstText.setText("Жми на кнопку");
                    status = true;
                }
            }
        });

    }
}
