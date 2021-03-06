package com.orhanobut.logger;

/**
 * Logger is a wrapper of {@link android.util.Log}
 * But more pretty, simple and powerful
 *
 * @author Orhan Obut
 */
public final class Logger {
    public static void globalOn() {
        LLogger.globalOn();
    }
    
    public static void globalOff() {
        LLogger.globalOff();
    }
    
    public static void compactOn() {
        LLogger.compactOn();
    }
    
    public static void compactOff() {
        LLogger.compactOff();
    }
    
    private static final LLogger printer = new LoggerPrinter();
    private static final String DEFAULT_TAG = "PRETTYLOGGER";
    
    //no instance
    private Logger() {
    }
    
    /**
     * It is used to get the settings object in order to change settings
     *
     * @return the settings object
     */
    public static Settings init() {
        return printer.init(DEFAULT_TAG);
    }
    
    /**
     * It is used to change the tag
     *
     * @param tag is the given string which will be used in Logger
     * @return settings
     */
    public static Settings init(String tag) {
        return printer.init(tag);
    }
    
    public static LLogger t(String tag) {
        return printer.t(tag, printer.getSettings().getMethodCount());
    }
    
    public static LLogger t(int methodCount) {
        return printer.t(null, methodCount);
    }
    
    public static LLogger t(String tag, int methodCount) {
        return printer.t(tag, methodCount);
    }
    
    public static void d(String message, Object... args) {
        printer.d(message, args);
    }
    
    public static void e(String message, Object... args) {
        printer.e(null, message, args);
    }
    
    public static void e(Throwable throwable, String message, Object... args) {
        printer.e(throwable, message, args);
    }
    
    public static void i(String message, Object... args) {
        printer.i(message, args);
    }
    
    public static void v(String message, Object... args) {
        printer.v(message, args);
    }
    
    public static void w(String message, Object... args) {
        printer.w(message, args);
    }
    
    public static void wtf(String message, Object... args) {
        printer.wtf(message, args);
    }
    
    public static void todo(String what){printer.todo(what);}
    
    /**
     * Formats the json content and print it
     *
     * @param json the json content
     */
    public static void json(String json) {
        printer.json(json);
    }
    
    /**
     * Formats the json content and print it
     *
     * @param xml the xml content
     */
    public static void xml(String xml) {
        printer.xml(xml);
    }
    
}
