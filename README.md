This is a hacked version of [Logger](https://github.com/orhanobut/logger) by Orhan Obut.

This logger allows us localize a logger so that we can on / off a log debug on a single file or on the
whole project.

# Do we have to change alot after long time using Logger?

Nothing. This can work well with the old Logger, just take a look at **Installation** to know how to use.


# What new?

## 1. Localize your logger

    LLogger LOG1 = LLogger.getLocalLogger();
    LLogger LOG2 = LLogger.getLocalLogger().withTag("YOUR TAG");
    LLogger LOG3 = LLogger.getLocalLogger().withTag("YOUR NEW TAG").withMethodCount(3);

    LOG1.d("This with default tag");
    LOG2.d("This changes tag to YOUR TAG");
    LOG3.d("This changes tag to YOUR NEW TAG and has 3 lines of method count");

    LOG1.off();
    LOG1.d("This is not shown!");
    LOG2.d("But this can be seen");
    LOG1.on();
    LOG1.d("This is logged again!");

    Logger.globalOff(); // or LLogger.globalOff();
    LOG1.d("NOTHING");
    LOG2.d("IS");
    LOG3.d("SHOWN");
    Logger.globalOn(); // or LLogger.globalOn();
    LOG1.d("Yeah! I'm here");

## 2. Add your favorite service for log (*)

_(*) Something like [Crashlytics](https://www.crashlytics.com/)_

    LLogger.addLogService(new LogService() {
        @Override
        public void run(String tag, String log, int level) {
            switch (level) {
                case Log.DEBUG:
                    System.out.println("S1 - DEBUG: " + log);
                    break;
                case Log.INFO:
                    System.out.println("S1 - INFO: " + log);
                    break;
                case Log.WARN:
                    System.out.println("S1 - WARN: " + log);
                    break;
                case Log.ERROR:
                    System.out.println("S1 - ERROR: " + log);
                    break;
                case Log.VERBOSE:
                    System.out.println("S1 - VERBOSE: " + log);
                    break;
                default:
                    System.out.println("S1: Err I don't catch this level");
            }
        }
    });

## 3. Compact mode

Compact mode makes all log into single line with file's link located at the end of the first line of log. This
applies to the global scope. To use this, just add:

    Logger.compactOn();

After do this, with this code:

    Logger.compactOn();
    Logger.d("Single line");
    Logger.d("Single line again");
    Logger.d("This is two\nlines of log");
    Logger.d("This is\nthree\nlines of log");


the log will look like this:

    03-31 17:34:06.203 11053-11053/? D/PRETTYLOGGER: ▉ Single line  (MainActivity.java:100)
    03-31 17:34:06.204 11053-11053/? D/PRETTYLOGGER: ▉ Single line again  (MainActivity.java:101)
    03-31 17:34:06.204 11053-11053/? D/PRETTYLOGGER: ▛ This is two  (MainActivity.java:102)
    03-31 17:34:06.204 11053-11053/? D/PRETTYLOGGER: ▙ lines of log
    03-31 17:34:06.204 11053-11053/? D/PRETTYLOGGER: ▛ This is  (MainActivity.java:103)
    03-31 17:34:06.204 11053-11053/? D/PRETTYLOGGER: ▍ three
    03-31 17:34:06.204 11053-11053/? D/PRETTYLOGGER: ▙ lines of log


**NOTE:** You may use compact mode with Local Logger.

# Installation

Add new this to your module `build.gradle`


    compile 'com.tuanchauict.logger:logger:1.1.1'


# License

Based on [Logger](https://github.com/orhanobut/logger) by Orhan Obut (The Apache Software License, Version 2.0). 
