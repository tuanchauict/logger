package com.orhanobut.logger;

/**
 * @author Orhan Obut
 */
public abstract class Logger {
    public static Logger getLocalLogger() {
        return new LoggerPrinter();
    }

    public static Logger getLocalLoggerWithTag(String tag) {
        Logger printer = new LoggerPrinter();
        printer.init(tag);
        return printer;
    }

    public static Logger getLocalLoggerWithTagAndMethodCount(String tag, int count){
        Logger printer = new LoggerPrinter();
        printer.init(tag);
        printer.t(null, count);
        return printer;
    }

    public static boolean globalOn = true;

    public static void globalOn(){
        globalOn = true;
    }

    public static void globalOff(){
        globalOn = false;
    }

    public static boolean isGlobalOn(){
        return globalOn;
    }

    public abstract Logger t(String tag, int methodCount);

    public abstract Settings init(String tag);

    public abstract Settings getSettings();

    public abstract void on();

    public abstract void off();

    public abstract void d(String message, Object... args);

    public abstract void e(String message, Object... args);

    public abstract void e(Throwable throwable, String message, Object... args);

    public abstract void w(String message, Object... args);

    public abstract void i(String message, Object... args);

    public abstract void v(String message, Object... args);

    public abstract void wtf(String message, Object... args);

    public abstract void json(String json);

    public abstract void xml(String xml);
}
