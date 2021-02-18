package com.example.LW1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class ThirdActivity extends AppCompatActivity {
    private EditText aEdit;
    private EditText bEdit;
    private EditText pEdit;
    private TextView result3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        aEdit = (EditText) findViewById(R.id.edita_3);
        bEdit = (EditText) findViewById(R.id.editb_3);
        pEdit = (EditText) findViewById(R.id.editp_3);
        result3 = (TextView) findViewById(R.id.result_3);
    }

    public void count3(View view) {
        try {
            float a = Float.parseFloat(aEdit.getText().toString());
            float b = Float.parseFloat(bEdit.getText().toString());
            int p = Integer.parseInt(pEdit.getText().toString());
            if(((a + b) >= 0) && p >= 1){
                double f = 0;

                for(int i = 1; i <= p; i++) {
                    for(int j = 1; j <= p; j++) {
                        for(int k = 1; k <= p; k++){
                            f += i*(i*j*(i*j*k*(sqrt(a + b))));
                        }
                    }
                }
                result3.setText(Double.toString(f));
            }
             else {
                Toast exc2 = Toast.makeText(this, R.string.exc2, Toast.LENGTH_SHORT);
                exc2.show();
            }
        } catch (Exception e) {
            Toast exc1 = Toast.makeText(this, R.string.exc1, Toast.LENGTH_SHORT);
            exc1.show();
        }
    }
}