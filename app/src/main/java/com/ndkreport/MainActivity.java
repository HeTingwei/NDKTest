package com.ndkreport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String msg="";
    String msg2="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=(TextView) findViewById(R.id.textView);
        NdkJniUtils n=new NdkJniUtils();
        msg=n.getCLanguageString();
        msg2=n.setCLanguageString("这是java传出去的句子");
        textView.setText("msg="+msg+"\n"+"msg2="+msg2);
    }
}
