package com.orhanobut.logger;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Orhan Obut
 */
public abstract class LLogger {

    protected static final List<LogService> sLogServices = new ArrayList<>();

    public static void addLogService(LogService middleware){
        sLogServices.add(middleware);
    }

    public static void clearLogService(){
        sLogServices.clear();
    }

    public static LLogger getLocalLogger() {
        return new LoggerPrinter();
    }

    public static LLogger getLocalLoggerWithTag(String tag) {
        LLogger printer = new LoggerPrinter();
        printer.init(tag);
        return printer;
    }

    public static LLogger getLocalLoggerWithTagAndMethodCount(String tag, int count){
        LLogger printer = new LoggerPrinter();
        printer.init(tag);
        printer.getSettings().setMethodCount(count);
        return printer;
    }

    public abstract LLogger withTag(String tag);

    public abstract LLogger withMethodCount(int count);

    public static boolean sGlobalOn = true;

    public static boolean sCompactMode = false;


    public static void globalOn(){
        sGlobalOn = true;
    }

    public static void globalOff(){
        sGlobalOn = false;
    }

    public static boolean isGlobalOn(){
        return sGlobalOn;
    }

    public abstract LLogger t(String tag, int methodCount);

    public abstract Settings init(String tag);

    public abstract Settings getSettings();

    public abstract LLogger on();

    public abstract LLogger off();

    public static void compactOn(){
        sCompactMode = true;
    }

    public static void compactOff(){
        sCompactMode = false;
    }
    
    public abstract void d(String message, Object... args);

    public abstract void e(String message, Object... args);

    public abstract void e(Throwable throwable, String message, Object... args);

    public abstract void w(String message, Object... args);

    public abstract void i(String message, Object... args);

    public abstract void v(String message, Object... args);

    public abstract void wtf(String message, Object... args);

    public abstract void json(String json);
    
    public abstract void jsond(String json);

    public abstract void xml(String xml);
    
    public abstract void todo(String what);
}
