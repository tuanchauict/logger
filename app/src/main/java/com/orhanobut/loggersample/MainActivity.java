package com.orhanobut.loggersample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.orhanobut.logger.LLogger;
import com.orhanobut.logger.LogService;
import com.orhanobut.logger.Logger;

import android.util.Log;


public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        LLogger.addLogService(new LogService() {
//            @Override
//            public void run(String tag, String log, int level) {
//                switch (level) {
//                    case Log.DEBUG:
//                        System.out.println("S1 - DEBUG: " + log);
//                        break;
//                    case Log.INFO:
//                        System.out.println("S1 - INFO: " + log);
//                        break;
//                    case Log.WARN:
//                        System.out.println("S1 - WARN: " + log);
//                        break;
//                    case Log.ERROR:
//                        System.out.println("S1 - ERROR: " + log);
//                        break;
//                    case Log.VERBOSE:
//                        System.out.println("S1 - VERBOSE: " + log);
//                        break;
//                    default:
//                        System.out.println("S1: Er I don't catch this level");
//                }
//            }
//        });
//
//        LLogger.addLogService(new LogService() {
//            @Override
//            public void run(String tag, String log, int level) {
//                switch (level) {
//                    case Log.DEBUG:
//                        System.out.println("S2 - DEBUG: " + log);
//                        break;
//                    case Log.INFO:
//                        System.out.println("S2 - INFO: " + log);
//                        break;
//                    case Log.WARN:
//                        System.out.println("S2 - WARN: " + log);
//                        break;
//                    case Log.ERROR:
//                        System.out.println("S2 - ERROR: " + log);
//                        break;
//                    case Log.VERBOSE:
//                        System.out.println("S2 - VERBOSE: " + log);
//                        break;
//                    default:
//                        System.out.println("S2: Er I don't catch this level");
//                }
//            }
//        });


//        LLogger LOG1 = LLogger.getLocalLogger();
//        LLogger LOG2 = LLogger.getLocalLoggerWithTag("YOUR TAG");
//        LLogger LOG3 = LLogger.getLocalLoggerWithTagAndMethodCount("YOUR NEW TAG", 3);

//        LOG1.d("This with \ndefault tag\nnew line");
//        LOG2.d("This changes tag to YOUR TAG");
//        LOG3.d("This changes tag to YOUR NEW TAG and has 3 lines of method count");

//        LOG1.off();
//        LOG1.d("This is not shown!");
//        LOG1.on();
//        LOG1.d("This is logged again!");

//        LLogger.globalOff();
//        LOG1.d("NOTHING");
//        LOG2.d("IS");
//        LOG3.d("SHOWN");
//        LLogger.globalOn();
//        LOG1.d("Yeah! I'm here");

        //Old fashion
//        Logger.d("This is an old fashion which is static");

        //Version 1.0.2
//        LLogger LOG4 = LLogger.getLocalLogger().withTag("TAG").withMethodCount(4).on();
//        LLogger LOG5 = LLogger.getLocalLogger().withTag("TAG").withMethodCount(4).off();

        Logger.compactOn();
        Logger.d("Single line");
        Logger.d("Single line again");
        Logger.d("This is two\nline of log");
        Logger.d("This is\nthree\nline of log");

    }


}
