package com.bpandadevelopmentsms.bpanadatest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bpandadevelopmentsms.bpandatest.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toaster.simpletoast(this,"Welcome to Bpanda00 SMS");
    }
}