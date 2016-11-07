package com.alarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int printHourCnt = 0;
        LinearLayout llHour = (LinearLayout) findViewById(R.id.llHour);
        int llHourChildCount = llHour.getChildCount();
        for (int i = 0; i < llHourChildCount; i++) {
            View llHourChild = llHour.getChildAt(i);
            if (llHourChild instanceof LinearLayout) {
                LinearLayout llHourLine = (LinearLayout) llHourChild;
                int llHourLineChildCount = llHourLine.getChildCount();
                for (int j = 0; j < llHourLineChildCount; j++) {
                    View btnView = llHourLine.getChildAt(j);
                    if (btnView instanceof  Button) {
                        Button btn = (Button) btnView;
                        btn.setTextSize(10);
                        btn.setText("n" + printHourCnt++);
                    }
                }
            }
        }

        int printMinuteCnt = 0;

        LinearLayout llMinute = (LinearLayout) findViewById(R.id.llMinute);
        int llMinuteChildCount = llMinute.getChildCount();
        for (int i = 0; i < llMinuteChildCount; i++) {
            View llMinuteChild = llMinute.getChildAt(i);
            if (llMinuteChild instanceof LinearLayout) {
                LinearLayout llMinuteLine = (LinearLayout) llMinuteChild;
                int llMinuteLineChildCount = llMinuteLine.getChildCount();
                for (int j = 0; j < llMinuteLineChildCount; j++) {
                    View btnView = llMinuteLine.getChildAt(j);
                    if (btnView instanceof  Button) {
                        Button btn = (Button) btnView;
                        btn.setTextSize(10);
                        btn.setText("n" + printMinuteCnt);
                        printMinuteCnt += 5;
                    }
                }
            }
        }



    }
}
