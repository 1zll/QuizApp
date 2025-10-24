package com.example.kadai11;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(this);

        RadioButton radioButton = findViewById(R.id.radioButton2);
        radioButton.setChecked(true);
    }
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        RadioButton checkedButton = findViewById(i);
    }
    public void onClick(View view) {
        if (view.getId() == R.id.button) {
            RadioButton radioButton1 = findViewById(R.id.radioButton);
            RadioButton radioButton2 = findViewById(R.id.radioButton2);
            RadioButton radioButton3 = findViewById(R.id.radioButton3);
            RadioButton radioButton4 = findViewById(R.id.radioButton4);

            TextView textView = findViewById(R.id.textView4);

            if (radioButton1.isChecked()) {
                textView.setText("不正解！");
            }
            else if (radioButton2.isChecked()) {
                textView.setText("正解！\nフラーレンは炭素原子60個でできているよ！");
            }
            else if (radioButton3.isChecked()) {
                textView.setText("不正解！");
            }
            else if (radioButton4.isChecked()) {
                textView.setText("不正解！");
            }
        }
    }

}