package com.orhanobut.loggersample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

<<<<<<< HEAD
import com.orhanobut.logger.Printer;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private static final Printer LOG = Printer.getLocalLogger();
    private static final Printer LOG2 = Printer.getLocalLoggerWithTag("Con heo");
    private static final Printer LOG3 = Printer.getLocalLoggerWithTagAndMethodCount("Con ca keo", 5);

=======
import com.orhanobut.logger.LLogger;
import com.orhanobut.logger.Logger;


>>>>>>> c89c40a94c79ee7c897c7d95bb25deb47d021f61

public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


<<<<<<< HEAD
        Printer LOG1 = Printer.getLocalLogger();
        Printer LOG2 = Printer.getLocalLoggerWithTag("YOUR TAG");
        Printer LOG3 = Printer.getLocalLoggerWithTagAndMethodCount("YOUR NEW TAG", 3);
=======
        LLogger LOG1 = LLogger.getLocalLogger();
        LLogger LOG2 = LLogger.getLocalLoggerWithTag("YOUR TAG");
        LLogger LOG3 = LLogger.getLocalLoggerWithTagAndMethodCount("YOUR NEW TAG", 3);
>>>>>>> c89c40a94c79ee7c897c7d95bb25deb47d021f61

        LOG1.d("This with default tag");
        LOG2.d("This changes tag to YOUR TAG");
        LOG3.d("This changes tag to YOUR NEW TAG and has 3 lines of method count");

        LOG1.off();
        LOG1.d("This is not shown!");
        LOG1.on();
        LOG1.d("This is logged again!");

        Printer.globalOff();
        LOG1.d("NOTHING");
        LOG2.d("IS");
        LOG3.d("SHOWN");
        Printer.globalOn();
        LOG1.d("Yeah! I'm here");

        //Old fashion
        Logger.d("This is an old fashion which is static");
    }


}
