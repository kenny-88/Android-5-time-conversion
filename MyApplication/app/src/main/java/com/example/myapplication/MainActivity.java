package com.example.android_num5_timeexchange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.bt1);
        button.setOnClickListener(the_Time);
    }
    private View.OnClickListener the_Time = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DecimalFormat time = new DecimalFormat("0");
            EditText year = (EditText)findViewById(R.id.ed1);
            EditText mouth = (EditText)findViewById(R.id.ed2);
            EditText day = (EditText)findViewById(R.id.ed3);
            EditText hour = (EditText)findViewById(R.id.ed4);
            EditText minute = (EditText)findViewById(R.id.ed5);
            EditText secord = (EditText)findViewById(R.id.ed6);
            int years = Integer.parseInt(year.getText().toString());
            int mouths = Integer.parseInt(mouth.getText().toString());
            int days = Integer.parseInt(day.getText().toString());
            int hours = Integer.parseInt(hour.getText().toString());
            int minutes = Integer.parseInt(minute.getText().toString());
            int secords = Integer.parseInt(secord.getText().toString());

            TextView tv10 = (TextView)findViewById(R.id.tv10);
            tv10.setText(time.format(years) + "/" + time.format(mouths) + "/" + time.format(days));
            TextView tv11 = (TextView)findViewById(R.id.tv11);
            tv11.setText(time.format(hours) + ":" + time.format(minutes) + ":" + time.format(secords));
            TextView tv9 = (TextView)findViewById(R.id.tv9);
            if (years % 4 == 0)
                tv12.setText("是");
            else if (years % 100 == 0)
                tv12.setText("是");
            else if (years % 400 == 0)
                tv12.setText("是");
            else
                tv12.setText("不是");
        }
    };
}