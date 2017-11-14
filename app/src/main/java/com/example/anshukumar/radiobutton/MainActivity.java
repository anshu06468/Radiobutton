package com.example.anshukumar.radiobutton;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);
        radioGroup=(RadioGroup)findViewById(R.id.radiogroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (radioGroup.getCheckedRadioButtonId()) {
                    case R.id.radioButton:
                        textView.setText("Uttam Kumar Singh");
                        break;
                    case R.id.radioButton2:
                        textView.setText("Vipin Rathi");
                        break;
                    case R.id.radioButton3:
                        textView.setText("Sonika Thakral");
                        break;
                    case R.id.radioButton4:
                        textView.setText("Sonika Thakral");
                        break;
                    case R.id.radioButton5:
                        textView.setText("Vipin Rathi");
                }
            }
        });
    }
}
