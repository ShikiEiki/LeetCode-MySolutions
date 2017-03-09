package com.frank.myleetcode;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by FH on 2017/3/9.
 */

public class MainActivity extends Activity{
    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.main_layout);
        textView = (TextView) findViewById(R.id.textview);
        
        super.onCreate(savedInstanceState);
    }
}
