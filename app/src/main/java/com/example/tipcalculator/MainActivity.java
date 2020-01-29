package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText BillTotal;
    private EditText TipTotal;
    private EditText Total;
    private EditText Partytotal;
    private RadioButton one;
    private RadioButton two;
    private RadioButton three;
    private RadioButton four;
    private RadioButton five;
    private RadioButton six;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BillTotal = findViewById(R.id.BillTotal);
        TipTotal = findViewById(R.id.TipTotal);
        Total = findViewById(R.id.Total);
        Partytotal= findViewById(R.id.Partytotal);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
    }
    public void clear(View v){
        if(Total.getText().length()>0||Partytotal.getText().length()>0){
            Total.setText("");
            Partytotal.setText("");
        }else{
            Total.setText("");
            Partytotal.setText("");
            BillTotal.setText("");
            TipTotal.setText("");
        }
    }

    public void calculate(View v) {
        if (one.isChecked()) {
            if (BillTotal.getText().length() > 0 && TipTotal.getText().length() > 0) {
                String bill = BillTotal.getText().toString();
                String tip = TipTotal.getText().toString();
                double billval = Double.parseDouble(bill);
                double tipval = Double.parseDouble(tip);
                double total = billval + (billval * tipval);
                Total.setText(String.format("%.2f", total));
                Partytotal.setText(String.format("%.2f", total));
            } else {
                Toast.makeText(this, "No Bill or Tip Value entered.", Toast.LENGTH_SHORT).show();
            }
        }
           else if (two.isChecked()) {
                if (BillTotal.getText().length() > 0 && TipTotal.getText().length() > 0) {
                    String bill = BillTotal.getText().toString();
                    String tip = TipTotal.getText().toString();
                    double billval = Double.parseDouble(bill);
                    double tipval = Double.parseDouble(tip);
                    double total = billval + (billval * tipval);
                    Total.setText(String.format("%.2f", total));
                    Partytotal.setText(String.format("%.2f", total / 2));
                } else {
                    Toast.makeText(this, "No Bill or Tip Value entered.", Toast.LENGTH_SHORT).show();
                }
            }
                else if (three.isChecked()) {
                    if (BillTotal.getText().length() > 0 && TipTotal.getText().length() > 0) {
                        String bill = BillTotal.getText().toString();
                        String tip = TipTotal.getText().toString();
                        double billval = Double.parseDouble(bill);
                        double tipval = Double.parseDouble(tip);
                        double total = billval + (billval * tipval);
                        Total.setText(String.format("%.2f", total));
                        Partytotal.setText(String.format("%.2f", total / 3));
                    } else {
                        Toast.makeText(this, "No Bill or Tip Value entered.", Toast.LENGTH_SHORT).show();
                    }
                }else if (four.isChecked()) {
            if (BillTotal.getText().length() > 0 && TipTotal.getText().length() > 0) {
                String bill = BillTotal.getText().toString();
                String tip = TipTotal.getText().toString();
                double billval = Double.parseDouble(bill);
                double tipval = Double.parseDouble(tip);
                double total = billval + (billval * tipval);
                Total.setText(String.format("%.2f", total));
                Partytotal.setText(String.format("%.2f", total / 4));
            } else {
                Toast.makeText(this, "No Bill or Tip Value entered.", Toast.LENGTH_SHORT).show();
            }
        }else if (five.isChecked()) {
            if (BillTotal.getText().length() > 0 && TipTotal.getText().length() > 0) {
                String bill = BillTotal.getText().toString();
                String tip = TipTotal.getText().toString();
                double billval = Double.parseDouble(bill);
                double tipval = Double.parseDouble(tip);
                double total = billval + (billval * tipval);
                Total.setText(String.format("%.2f", total));
                Partytotal.setText(String.format("%.2f", total / 5));
            } else {
                Toast.makeText(this, "No Bill or Tip Value entered.", Toast.LENGTH_SHORT).show();
            }
        }else if (six.isChecked()) {
            if (BillTotal.getText().length() > 0 && TipTotal.getText().length() > 0) {
                String bill = BillTotal.getText().toString();
                String tip = TipTotal.getText().toString();
                double billval = Double.parseDouble(bill);
                double tipval = Double.parseDouble(tip);
                double total = billval + (billval * tipval);
                Total.setText(String.format("%.2f", total));
                Partytotal.setText(String.format("%.2f", total / 6));
            } else {
                Toast.makeText(this, "No Bill or Tip Value entered.", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, "You have failed to include the size of your party.", Toast.LENGTH_SHORT).show();
        }
                }
            }






