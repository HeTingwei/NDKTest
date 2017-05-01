package com.ndkreport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NdkJniUtils n=new NdkJniUtils();
        Toast.makeText(this, n.getCLanguageString(), Toast.LENGTH_SHORT).show();

    }
}
