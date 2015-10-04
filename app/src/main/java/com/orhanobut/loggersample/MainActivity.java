package com.orhanobut.loggersample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

import com.orhanobut.logger.SLogger;
import com.orhanobut.logger.Logger;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private static final Logger LOG = Logger.getLocalLogger();
    private static final Logger LOG2 = Logger.getLocalLoggerWithTag("Con heo");
    private static final Logger LOG3 = Logger.getLocalLoggerWithTagAndMethodCount("Con ca keo", 5);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        SLogger.init("test").hideThreadInfo().setMethodCount(3).setMethodOffset(2);
        LOG.i("default");
        LOG2.w("Con heo");
        LOG.off();
        LOG.d("This is not shown!");
        LOG.on();
        LOG.d("This is displayed again");
        LOG3.d("This is LOG3");


//        printNormalLog();
//        printPretty();
    }

    void printNormalLog() {
        Log.v(TAG, "hey i am a log which you don't see easily");
        Log.v(TAG, "i = 0 + 1");
        Log.v(TAG, Dummy.JSON_WITH_NO_LINE_BREAK);
        Log.v("test", Dummy.JSON_WITH_LINE_BREAK);
    }

    void printPretty() {
        test2();
        Foo.foo();

        try {
            Class clazz = Class.forName("asdfasd");
        } catch (ClassNotFoundException e) {
            SLogger.e(e, "something happened");
        }

        String test = "[" + Dummy.JSON_WITH_NO_LINE_BREAK + "," + Dummy.JSON_WITH_NO_LINE_BREAK + "]";

        SLogger.json(Dummy.SMALL_SON_WITH_NO_LINE_BREAK);

        SLogger.d("test");

        SLogger.t("TEST", 3).d("asdfasdf");
    }

    void test2() {
        SLogger.v("test2");
        SLogger.v("test3");
        SLogger.v("MYTAG");
        SLogger.wtf("test3");
        SLogger.d("logger with tag");
        SLogger.t("tag").d("logger with tag");
        SLogger.t("tag", 3).d("logger with 3 method count");
    }

}
