package com.example.LW1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class SecondActivity extends AppCompatActivity {
    private EditText aEdit;
    private EditText cEdit;
    private EditText kEdit;
    private TextView result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        aEdit = (EditText) findViewById(R.id.edita_2);
        cEdit = (EditText) findViewById(R.id.editс_2);
        kEdit = (EditText) findViewById(R.id.editk_2);
        result2 = (TextView) findViewById(R.id.result_2);
    }

    public void launchThirdActivity(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    public void count2(View view) {
        try {
            float a = Float.parseFloat(aEdit.getText().toString());
            float c = Float.parseFloat(cEdit.getText().toString());
            float k = Float.parseFloat(kEdit.getText().toString());
            if(k < 10){
                double y = (double) ((pow((a + c), 4)) + (pow((a - c), 2)));
                result2.setText(Double.toString(y));
            } else {
                double y = (double) ((pow((a - c), 3)) + (pow((a + c), 2)));
                result2.setText(Double.toString(y));
            }
        } catch (Exception e) {
            Toast exc1 = Toast.makeText(this, R.string.exc1, Toast.LENGTH_SHORT);
            exc1.show();
        }
    }
}