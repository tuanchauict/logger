package com.orhanobut.loggersample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

import com.orhanobut.logger.LLogger;
import com.orhanobut.logger.Logger;



public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LLogger LOG1 = LLogger.getLocalLogger();
        LLogger LOG2 = LLogger.getLocalLoggerWithTag("YOUR TAG");
        LLogger LOG3 = LLogger.getLocalLoggerWithTagAndMethodCount("YOUR NEW TAG", 3);

        LOG1.d("This with default tag");
        LOG2.d("This changes tag to YOUR TAG");
        LOG3.d("This changes tag to YOUR NEW TAG and has 3 lines of method count");

        LOG1.off();
        LOG1.d("This is not shown!");
        LOG1.on();
        LOG1.d("This is logged again!");

        Logger.globalOff();
        LOG1.d("NOTHING");
        LOG2.d("IS");
        LOG3.d("SHOWN");
        Logger.globalOn();
        LOG1.d("Yeah! I'm here");

        //Old fashion
        Logger.d("This is an old fashion which is static");
    }


}
