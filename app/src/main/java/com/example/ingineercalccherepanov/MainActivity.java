package com.example.ingineercalccherepanov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mModeBtn;
    private LinearLayout mEngineerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        mModeBtn = findViewById(R.id.switchModeTxtView);
        mEngineerView = findViewById(R.id.engineerView);

        mModeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch(mEngineerView.getVisibility()) {
                    case (View.GONE) :
                        mEngineerView.setVisibility(View.VISIBLE);
                        break;

                    case (View.VISIBLE) :
                        mEngineerView.setVisibility(View.GONE);
                        break;

                    default:
                        break;
                }
            }
        });
    }
}
