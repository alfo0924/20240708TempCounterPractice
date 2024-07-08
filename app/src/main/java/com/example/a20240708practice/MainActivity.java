package com.example.a20240708practice;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void CtoF(View view){
     EditText temperature = (EditText)findViewById(R.id.temp);
     TextView result = (TextView)findViewById(R.id.result);

     result.setText(temperature.getText().toString());
     int t=Integer.parseInt(temperature.getText().toString());
     double fTemperature=t*9/5+32;
     result.setText(String.valueOf(fTemperature));
    }
    public void FtoC(View view){
        EditText temperature = (EditText)findViewById(R.id.temp);
        TextView result = (TextView)findViewById(R.id.result);

        result.setText(temperature.getText().toString());
        int t=Integer.parseInt(temperature.getText().toString());
        double cTemperature=(t-32)*5/9;
        result.setText(String.valueOf(cTemperature));
    }
}