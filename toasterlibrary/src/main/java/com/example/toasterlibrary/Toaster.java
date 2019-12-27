package com.example.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void s(Context context,String msg){
        Toast.makeText(context, "New Library", Toast.LENGTH_SHORT).show();
    }
}
