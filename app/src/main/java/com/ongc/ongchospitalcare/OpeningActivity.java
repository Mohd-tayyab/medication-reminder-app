package com.ongc.ongchospitalcare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class OpeningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);
    }
        public void onSend(View view)
        {
            Intent intent=new Intent(this, MainActivity.class);
            startActivity(intent);
    }
}
