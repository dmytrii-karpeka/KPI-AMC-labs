package com.example.LW1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {
    private EditText aEdit;
    private EditText bEdit;
    private EditText cEdit;
    private EditText dEdit;
    private TextView result1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aEdit = (EditText) findViewById(R.id.edita_1);
        bEdit = (EditText) findViewById(R.id.editb_1);
        cEdit = (EditText) findViewById(R.id.editс_1);
        dEdit = (EditText) findViewById(R.id.editd_1);
        result1 = (TextView) findViewById(R.id.result_1);
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void count1(View view) {
        try {
            float a = Float.parseFloat(aEdit.getText().toString());
            float b = Float.parseFloat(bEdit.getText().toString());
            float c = Float.parseFloat(cEdit.getText().toString());
            float d = Float.parseFloat(dEdit.getText().toString());
            if(c == 0 || d == 0 || (sqrt(b) - a*a) == 0){
                Toast exc2 = Toast.makeText(this, R.string.exc2, Toast.LENGTH_SHORT);
                exc2.show();
            } else {
                double y1 = (double) (((double) (sqrt(a) + b * b)) / ((double) (sqrt(b) - a * a)) + (double) sqrt((a * b) / (c * d)));
                result1.setText(Double.toString(y1));
            }
        } catch (Exception e) {
            Toast exc1 = Toast.makeText(this, R.string.exc1, Toast.LENGTH_SHORT);
            exc1.show();
        }
    }
}