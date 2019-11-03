package com.example.numberconverter;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button zero,one,two,three,four,five,six,seven,eight,nine,a,b,c,d,e,f;
    private Switch binary,decimal,octal,hexa;
    private TextView input, binary_text,decimal_text,octal_text,hexa_text;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero = findViewById(R.id.Button_0);
        one = findViewById(R.id.Button_1);
        two= findViewById(R.id.Button_2);
        three = findViewById(R.id.Button_3);
        four = findViewById(R.id.Button_4);
        five = findViewById(R.id.Button_5);
        six = findViewById(R.id.Button_6);
        seven = findViewById(R.id.Button_7);
        eight = findViewById(R.id.Button_8);
        nine = findViewById(R.id.Button_9);
        a = findViewById(R.id.Button_A);
        b = findViewById(R.id.Button_B);
        c = findViewById(R.id.Button_C);
        d= findViewById(R.id.Button_D);
        e = findViewById(R.id.Button_E);
        f = findViewById(R.id.Button_F);
        binary = findViewById(R.id.Binary_toggle);
        decimal = findViewById(R.id.Decimal_Toggle);
        octal = findViewById(R.id.Octal_Toggle);
        hexa = findViewById(R.id.Hexa_Toggle);
        input = findViewById(R.id.text_input);
        binary_text = findViewById(R.id.binary_text);
        octal_text = findViewById(R.id.octal_text);
        hexa_text = findViewById(R.id.hexa_text);
        decimal_text = findViewById(R.id.decimal_text);
        input.setText("");
        decimal.setChecked(true);
        getSupportActionBar().hide();

    }

    public void register7(View view) {
        input.setText(input.getText()+ "7");
        if(decimal.isChecked()) {
            convert_decimal_to_binary();
            convert_decimal_to_octal();
            convert_decimal_to_hexa();
            decimal_text.setText(input.getText());
        }
        if(octal.isChecked())
        {
            convert_octal_to_hexa();
            convert_octal_to_decimal();
            convert_octal_to_binary();
            octal_text.setText(input.getText());
        }
        if(hexa.isChecked())
        {
            convert_hexa_to_binary();
            convert_hexa_to_decimal();
            convert_hexa_to_octal();
            hexa_text.setText(input.getText());
        }
    }

    public void register8(View view) {
        input.setText(input.getText()+ "8");
        if(decimal.isChecked()) {
            convert_decimal_to_binary();
            convert_decimal_to_octal();
            convert_decimal_to_hexa();
            decimal_text.setText(input.getText());
        }
        if(hexa.isChecked())
        {
            convert_hexa_to_binary();
            convert_hexa_to_decimal();
            convert_hexa_to_octal();
            hexa_text.setText(input.getText());
        }
    }

    public void register9(View view) {
        input.setText(input.getText()+ "9");
        if(decimal.isChecked()) {
            convert_decimal_to_binary();
            convert_decimal_to_octal();
            convert_decimal_to_hexa();
            decimal_text.setText(input.getText());
        }
        if(hexa.isChecked())
        {
            convert_hexa_to_binary();
            convert_hexa_to_decimal();
            convert_hexa_to_octal();
            hexa_text.setText(input.getText());
        }
    }

    public void register4(View view) {
        input.setText(input.getText()+ "4");
        if(decimal.isChecked()) {
            convert_decimal_to_binary();
            convert_decimal_to_octal();
            convert_decimal_to_hexa();
            decimal_text.setText(input.getText());
        }
        if(octal.isChecked())
        {
            convert_octal_to_hexa();
            convert_octal_to_decimal();
            convert_octal_to_binary();
            octal_text.setText(input.getText());
        }
        if(hexa.isChecked())
        {
            convert_hexa_to_binary();
            convert_hexa_to_decimal();
            convert_hexa_to_octal();
            hexa_text.setText(input.getText());
        }
    }

    public void register5(View view) {
        input.setText(input.getText()+ "5");
        if(decimal.isChecked()) {
            convert_decimal_to_binary();
            convert_decimal_to_octal();
            convert_decimal_to_hexa();
            decimal_text.setText(input.getText());
        }
        if(octal.isChecked())
        {
            convert_octal_to_hexa();
            convert_octal_to_decimal();
            convert_octal_to_binary();
            octal_text.setText(input.getText());
        }
        if(hexa.isChecked())
        {
            convert_hexa_to_binary();
            convert_hexa_to_decimal();
            convert_hexa_to_octal();
            hexa_text.setText(input.getText());
        }
    }

    public void register6(View view) {
        input.setText(input.getText()+ "6");
        if(decimal.isChecked()) {
            convert_decimal_to_binary();
            convert_decimal_to_octal();
            convert_decimal_to_hexa();
            decimal_text.setText(input.getText());
        }
        if(octal.isChecked())
        {
            convert_octal_to_hexa();
            convert_octal_to_decimal();
            convert_octal_to_binary();
            octal_text.setText(input.getText());
        }
        if(hexa.isChecked())
        {
            convert_hexa_to_binary();
            convert_hexa_to_decimal();
            convert_hexa_to_octal();
            hexa_text.setText(input.getText());
        }
    }

    public void register3(View view) {
        input.setText(input.getText()+ "3");
        if(decimal.isChecked()) {
            convert_decimal_to_binary();
            convert_decimal_to_octal();
            convert_decimal_to_hexa();
            decimal_text.setText(input.getText());
        }
        if(octal.isChecked())
        {
            convert_octal_to_hexa();
            convert_octal_to_decimal();
            convert_octal_to_binary();
            octal_text.setText(input.getText());
        }
        if(hexa.isChecked())
        {
            convert_hexa_to_binary();
            convert_hexa_to_decimal();
            convert_hexa_to_octal();
            hexa_text.setText(input.getText());
        }
    }

    public void register2(View view) {
        input.setText(input.getText()+ "2");
        if(decimal.isChecked()) {
            convert_decimal_to_binary();
            convert_decimal_to_octal();
            convert_decimal_to_hexa();
            decimal_text.setText(input.getText());
        }
        if(octal.isChecked())
        {
            convert_octal_to_hexa();
            convert_octal_to_decimal();
            convert_octal_to_binary();
            octal_text.setText(input.getText());
        }
        if(hexa.isChecked())
        {
            convert_hexa_to_binary();
            convert_hexa_to_decimal();
            convert_hexa_to_octal();
            hexa_text.setText(input.getText());
        }
    }

    public void register1(View view) {
      //  String temp = (String) input.getText();

        input.setText(input.getText()+ "1");
        if(decimal.isChecked()) {
            convert_decimal_to_binary();
            convert_decimal_to_octal();
            convert_decimal_to_hexa();
            decimal_text.setText(input.getText());
        }
        else if(binary.isChecked())
        {
            convert_binary_to_decimal();
            convert_binary_to_hexa();
            convert_binary_to_octal();
            binary_text.setText(input.getText());
        }
        if(octal.isChecked())
        {
            convert_octal_to_hexa();
            convert_octal_to_decimal();
            convert_octal_to_binary();
            octal_text.setText(input.getText());
        }
        if(hexa.isChecked())
        {
            convert_hexa_to_binary();
            convert_hexa_to_decimal();
            convert_hexa_to_octal();
            hexa_text.setText(input.getText());
        }
    }

    public void convert_decimal_to_binary()
    {
        int convert = Integer.parseInt((String) input.getText());
        String output = "";
        int temp;
        while(convert > 0)
        {
            temp = convert;
            output = (temp%2) + output;
            convert = convert/2;
        }
       binary_text.setText(output);
    }
    public void convert_decimal_to_octal()
    {
        int convert = Integer.parseInt((String) input.getText());
        String output = "";
        int temp;
        while(convert > 0)
        {
            temp = convert;
            output = (temp%8) + output;
            convert = convert/8;
        }
        octal_text.setText(output);

    }
    public void convert_decimal_to_hexa()
    {
        int convert = Integer.parseInt((String) input.getText());
        String output = "";
        int temp;
        while(convert > 0)
        {
            temp = convert;
            temp = temp%16;
            if(temp < 10)
                output = temp + output;
            else if(temp == 10)
                output = "A" + output;
            else if(temp == 11)
                output = "B" + output;
            else if(temp == 12)
                output = "C" + output;
            else if(temp == 13)
                output = "D" + output;
            else if(temp == 14)
                output = "E" + output;
            else if(temp == 15)
                output = "F" + output;
            convert = convert/16;
        }
        hexa_text.setText(output);

    }
    public void convert_binary_to_decimal()
    {
        int convert = Integer.parseInt((String) input.getText(),2);
        decimal_text.setText(Integer.toString(convert));
    }
    public void convert_binary_to_octal()
    {
        int convert = Integer.parseInt((String) input.getText(),2);
        String output = "";
        int temp;
        while(convert > 0)
        {
            temp = convert;
            output = (temp%8) + output;
            convert = convert/8;
        }
        octal_text.setText(output);

    }
    public void convert_binary_to_hexa()
    {
        int convert = Integer.parseInt((String) input.getText(),2);
        String output = "";
        int temp;
        while(convert > 0)
        {
            temp = convert;
            temp = temp%16;
            if(temp < 10)
                output = temp + output;
            else if(temp == 10)
                output = "A" + output;
            else if(temp == 11)
                output = "B" + output;
            else if(temp == 12)
                output = "C" + output;
            else if(temp == 13)
                output = "D" + output;
            else if(temp == 14)
                output = "E" + output;
            else if(temp == 15)
                output = "F" + output;
            convert = convert/16;
        }
        hexa_text.setText(output);
    }

    public void convert_octal_to_binary()
    {
        int convert = Integer.parseInt((String) input.getText(),8);
        String output = "";
        int temp;
        while(convert > 0)
        {
            temp = convert;
            output = (temp%2) + output;
            convert = convert/2;
        }
        binary_text.setText(output);

    }
    public void convert_octal_to_decimal()
    {
        int convert = Integer.parseInt((String) input.getText(),8);
        decimal_text.setText(Integer.toString(convert));
    }
    public void convert_octal_to_hexa()
    {
        int convert = Integer.parseInt((String) input.getText(),8);
        String output = "";
        int temp;
        while(convert > 0)
        {
            temp = convert;
            temp = temp%16;
            if(temp < 10)
                output = temp + output;
            else if(temp == 10)
                output = "A" + output;
            else if(temp == 11)
                output = "B" + output;
            else if(temp == 12)
                output = "C" + output;
            else if(temp == 13)
                output = "D" + output;
            else if(temp == 14)
                output = "E" + output;
            else if(temp == 15)
                output = "F" + output;
            convert = convert/16;
        }
        hexa_text.setText(output);
    }

    public void convert_hexa_to_binary()
    {
        int convert = Integer.parseInt((String) input.getText(),16);
        String output = "";
        int temp;
        while(convert > 0)
        {
            temp = convert;
            output = (temp%2) + output;
            convert = convert/2;
        }
        binary_text.setText(output);
    }
    public void convert_hexa_to_decimal()
    {
        int convert = Integer.parseInt((String) input.getText(),16);
        decimal_text.setText(Integer.toString(convert));
    }
    public void convert_hexa_to_octal()
    {
        int convert = Integer.parseInt((String) input.getText(),16);
        String output = "";
        int temp;
        while(convert > 0)
        {
            temp = convert;
            output = (temp%8) + output;
            convert = convert/8;
        }
        octal_text.setText(output);
    }



    public void Binary_toggle(View view) {
        //toggles other switches off
        decimal.setChecked(false);
        octal.setChecked(false);
        hexa.setChecked(false);
        //deactivates buttons 2-F
        two.setClickable(false);
        two.setTextColor(Color.GRAY);
        three.setClickable(false);
        three.setTextColor(Color.GRAY);
        four.setClickable(false);
        four.setTextColor(Color.GRAY);
        five.setClickable(false);
        five.setTextColor(Color.GRAY);
        six.setClickable(false);
        six.setTextColor(Color.GRAY);
        seven.setClickable(false);
        seven.setTextColor(Color.GRAY);
        eight.setClickable(false);
        eight.setTextColor(Color.GRAY);
        nine.setClickable(false);
        nine.setTextColor(Color.GRAY);
        a.setClickable(false);
        a.setTextColor(Color.GRAY);
        b.setClickable(false);
        b.setTextColor(Color.GRAY);
        c.setClickable(false);
        c.setTextColor(Color.GRAY);
        d.setClickable(false);
        d.setTextColor(Color.GRAY);
        e.setClickable(false);
        e.setTextColor(Color.GRAY);
        f.setClickable(false);
        f.setTextColor(Color.GRAY);

    }

    public void Decimal_Toggle(View view) {
        //toggles other switches off
        binary.setChecked(false);
        octal.setChecked(false);
        hexa.setChecked(false);
        //deactivates buttons A-F, and reactivates 2-9
        //disabled text is gray
        //enabled text is black
        two.setClickable(true);
        two.setTextColor(Color.BLACK);
        three.setClickable(true);
        three.setTextColor(Color.BLACK);
        four.setClickable(true);
        four.setTextColor(Color.BLACK);
        five.setClickable(true);
        five.setTextColor(Color.BLACK);
        six.setClickable(true);
        six.setTextColor(Color.BLACK);
        seven.setClickable(true);
        seven.setTextColor(Color.BLACK);
        eight.setClickable(true);
        eight.setTextColor(Color.BLACK);
        nine.setClickable(true);
        nine.setTextColor(Color.BLACK);
        a.setClickable(false);
        a.setTextColor(Color.GRAY);
        b.setClickable(false);
        b.setTextColor(Color.GRAY);
        c.setClickable(false);
        c.setTextColor(Color.GRAY);
        d.setClickable(false);
        d.setTextColor(Color.GRAY);
        e.setClickable(false);
        e.setTextColor(Color.GRAY);
        f.setClickable(false);
        f.setTextColor(Color.GRAY);
    }

    public void Octal_Toggle(View view) {
        //toggles other switches off
        decimal.setChecked(false);
        binary.setChecked(false);
        hexa.setChecked(false);
        //deactivates buttons 8-F
        two.setClickable(true);
        two.setTextColor(Color.BLACK);
        three.setClickable(true);
        three.setTextColor(Color.BLACK);
        four.setClickable(true);
        four.setTextColor(Color.BLACK);
        five.setClickable(true);
        five.setTextColor(Color.BLACK);
        six.setClickable(true);
        six.setTextColor(Color.BLACK);
        seven.setClickable(true);
        seven.setTextColor(Color.BLACK);
        eight.setClickable(false);
        eight.setTextColor(Color.GRAY);
        nine.setClickable(false);
        nine.setTextColor(Color.GRAY);
        a.setClickable(false);
        a.setTextColor(Color.GRAY);
        b.setClickable(false);
        b.setTextColor(Color.GRAY);
        c.setClickable(false);
        c.setTextColor(Color.GRAY);
        d.setClickable(false);
        d.setTextColor(Color.GRAY);
        e.setClickable(false);
        e.setTextColor(Color.GRAY);
        f.setClickable(false);
        f.setTextColor(Color.GRAY);
    }

    public void Hexa_Toggle(View view) {
        //toggles other switches off
        decimal.setChecked(false);
        octal.setChecked(false);
        binary.setChecked(false);
        //activates all buttons
        two.setClickable(true);
        two.setTextColor(Color.BLACK);
        three.setClickable(true);
        three.setTextColor(Color.BLACK);
        four.setClickable(true);
        four.setTextColor(Color.BLACK);
        five.setClickable(true);
        five.setTextColor(Color.BLACK);
        six.setClickable(true);
        six.setTextColor(Color.BLACK);
        seven.setClickable(true);
        seven.setTextColor(Color.BLACK);
        eight.setClickable(true);
        eight.setTextColor(Color.BLACK);
        nine.setClickable(true);
        nine.setTextColor(Color.BLACK);
        a.setClickable(true);
        a.setTextColor(Color.BLACK);
        b.setClickable(true);
        b.setTextColor(Color.BLACK);
        c.setClickable(true);
        c.setTextColor(Color.BLACK);
        d.setClickable(true);
        d.setTextColor(Color.BLACK);
        e.setClickable(true);
        e.setTextColor(Color.BLACK);
        f.setClickable(true);
        f.setTextColor(Color.BLACK);
    }

    public void register0(View view) {
        input.setText(input.getText()+ "0");
        if(decimal.isChecked()) {
            convert_decimal_to_binary();
            convert_decimal_to_octal();
            convert_decimal_to_hexa();
            decimal_text.setText(input.getText());
        }
        else if(binary.isChecked())
        {
            convert_binary_to_decimal();
            convert_binary_to_hexa();
            convert_binary_to_octal();
            binary_text.setText(input.getText());
        }
        if(octal.isChecked())
        {
            convert_octal_to_hexa();
            convert_octal_to_decimal();
            convert_octal_to_binary();
            octal_text.setText(input.getText());
        }
        if(hexa.isChecked())
        {
            convert_hexa_to_binary();
            convert_hexa_to_decimal();
            convert_hexa_to_octal();
            hexa_text.setText(input.getText());
        }
    }

    public void registerA(View view) {
        input.setText(input.getText()+ "A");
        if(hexa.isChecked())
        {
            convert_hexa_to_binary();
            convert_hexa_to_decimal();
            convert_hexa_to_octal();
            hexa_text.setText(input.getText());
        }
    }

    public void registerB(View view) {
        input.setText(input.getText()+ "B");
        if(hexa.isChecked())
        {
            convert_hexa_to_binary();
            convert_hexa_to_decimal();
            convert_hexa_to_octal();
            hexa_text.setText(input.getText());
        }
    }

    public void registerC(View view) {
        input.setText(input.getText()+ "C");
        if(hexa.isChecked())
        {
            convert_hexa_to_binary();
            convert_hexa_to_decimal();
            convert_hexa_to_octal();
            hexa_text.setText(input.getText());
        }
    }

    public void registerD(View view) {
        input.setText(input.getText()+ "D");
        if(hexa.isChecked())
        {
            convert_hexa_to_binary();
            convert_hexa_to_decimal();
            convert_hexa_to_octal();
            hexa_text.setText(input.getText());
        }
    }

    public void registerE(View view) {
        input.setText(input.getText()+ "E");
        if(hexa.isChecked())
        {
            convert_hexa_to_binary();
            convert_hexa_to_decimal();
            convert_hexa_to_octal();
            hexa_text.setText(input.getText());
        }
    }

    public void registerF(View view) {
        input.setText(input.getText()+ "F");
        if(hexa.isChecked())
        {
            convert_hexa_to_binary();
            convert_hexa_to_decimal();
            convert_hexa_to_octal();
            hexa_text.setText(input.getText());
        }
    }

    public void button_clear(View view) {
        input.setText("");
        binary_text.setText("");
        octal_text.setText("");
        decimal_text.setText("");
        hexa_text.setText("");
    }

    public void backspace(View view) {
        String temp = (String) input.getText();
        if(temp.length()!=0) {
            temp = temp.substring(0, temp.length() - 1);
            input.setText(temp);
        }

    }
}
