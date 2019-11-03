package com.example.helloworld;
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

    private int count,maxCount;
    private long delay;
    private TextView mShowCount;
    private EditText user_bpm;
    private boolean running;
    private DoSomethingThread randomWork;
    private Button bpm60,bpm80,bpm90,bpm100,bpm120,bpm180;
    private Switch tempo34,tempo44;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount =findViewById(R.id.bpm);
        user_bpm = findViewById(R.id.custom_tempo);
        bpm60 = findViewById(R.id.bpm_60);
        bpm80 = findViewById(R.id.bpm_80);
        bpm90 = findViewById(R.id.bpm_90);
        bpm100 = findViewById(R.id.bpm_100);
        bpm120 = findViewById(R.id.bpm_120);
        bpm180 = findViewById(R.id.bpm_180);
        tempo34 = findViewById(R.id.tempo_34);
        tempo44 = findViewById(R.id.tempo_44);
        tempo44.setChecked(true);
        count = 1;
        maxCount = 4;
        running = false;
        getSupportActionBar().hide();
    }

    public void set60(View view) {
        delay = 1000;
        if (running)
        {
            stopGenerating();
            running = false;
            count = 1;
        } else
            {
                running = true;
                count = 1;
                startGenerating(delay);
            }
    }

    public void set80(View view) {
        delay = 750;
        if (running)
        {
            stopGenerating();
            running = false;
            count = 1;
        } else
        {
            running = true;
            count = 1;
            startGenerating(delay);
        }
    }

    public void set90(View view) {
        delay = 667;
        if (running)
        {
            stopGenerating();
            running = false;
            count = 1;
        } else
        {
            running = true;
            count = 1;
            startGenerating(delay);
        }
    }

    public void set100(View view) {
        delay = 600;
        if (running)
        {
            stopGenerating();
            running = false;
            count = 1;
        } else
        {
            running = true;
            count = 1;
            startGenerating(delay);
        }
    }

    public void set120(View view) {
        delay = 500;
        if (running)
        {
            stopGenerating();
            running = false;
            count = 1;
        } else
        {
            running = true;
            count = 1;
            startGenerating(delay);
        }
    }

    public void set180(View view) {

        delay = 333;
        if (running)
        {
            stopGenerating();
            running = false;
            count = 1;
        } else
        {
            running = true;
            count = 1;
            startGenerating(delay);
        }
    }

    private void startGenerating(long delay) {
        randomWork = new DoSomethingThread(delay);
        randomWork.start();
    }

    private void stopGenerating() {

        randomWork.interrupt();
    }

    public void accept_user(View view)
    {
        String input = user_bpm.getText().toString();
            try {
                long delay = Long.parseLong(input);
                if(delay == 0)
                    delay = 60;
                delay = (long)((60 / (float)delay) * 1000);
                if (running) {
                    stopGenerating();
                    running = false;
                    count = 1;
                } else {
                    running = true;
                    count = 1;
                    startGenerating(delay);
                }
            }
            catch(NumberFormatException e)
            {

            }
    }

    public void clearText(View view) {
        user_bpm.setText("");
    }

    @SuppressLint("SetTextI18n")
    public void reset_display(View view) {
        if(running) {
            stopGenerating();
            mShowCount.setTextColor(Color.BLACK);
            mShowCount.setText("BPM");
            count = 1;
            running = false;
        }

    }

    public void tempo_44(View view) {
        maxCount = 4;
        tempo34.setChecked(false);
    }

    public void tempo_34(View view) {
        maxCount = 3;
        tempo44.setChecked(false);
    }


    public class DoSomethingThread extends Thread {

        private final long DELAY;

        private DoSomethingThread(long delay)
        {
            DELAY = delay;
        }

        @Override
        public void run() {
            while (true) {
                updateCount();
                try {
                    Thread.sleep(DELAY);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }

        private void updateCount()
        {
            runOnUiThread(new Runnable(){
                @SuppressLint("SetTextI18n")
                @Override
                public void run()
                {
                    if(count >= maxCount+1)
                        count =1;
                    if(count == 1)
                    {
                        mShowCount.setTextColor(Color.RED);
                        mShowCount.setText(Integer.toString(count));
                    }
                    else {
                        mShowCount.setTextColor(Color.BLACK);
                        mShowCount.setText(Integer.toString(count));
                    }
                    count++;
                }
            });
        }
    }
}


