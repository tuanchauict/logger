package com.orhanobut.logger;

/**
 * Created by tuanchauict on 10/7/15.
 */
public interface LogService {
    /**
     * Will run whenever a log print is called for all of the project LLogger instances even
     * globalOff() or off() are turning on.
     *
     * @param tag is the tag of a LLogger instance.
     * @param log is formatted string
     * @param level based on android.util.Log
     */
    void run(String tag, String log, int level);
}
