package com.bpandadevelopmentsms.bpandatest;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void simpletoast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
