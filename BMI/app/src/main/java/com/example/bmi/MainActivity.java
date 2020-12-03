package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText Name;
    EditText Weight;
    EditText Height;
    TextView display;
    TextView display2;

    Button Go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name=findViewById(R.id.txtName);
        Weight=findViewById(R.id.txtWeight);
        Height=findViewById(R.id.txtHeight);
        display=findViewById(R.id.txtDisplay1);
        display2=findViewById(R.id.txtDisplay2);


        Go=findViewById(R.id.btnGo);

        Go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtName;
                String txtWeight;
                String txtHeight;


                txtName = Name.getText().toString();
                txtWeight = Weight.getText().toString();
                txtHeight = Height.getText().toString();

                double cont1 = Double.parseDouble(txtWeight);
                double cont2 = Double.parseDouble(txtHeight);

                double total = cont1 / (cont2 * cont2);

                display.setText("Name: " + txtName);
                display2.setText("Body Mass Index: " + total);



            }
        });

    }

}