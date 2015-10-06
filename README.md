This is a hacked version of [Logger](https://github.com/orhanobut/logger) by Orhan Obut.

This logger allows us localize a log so that we can on / off a log debug on a single file or on the
whole project.

# What have been changed in this hacked?

Nothing. This can work well with the old Logger, just take a look at Installation to know how to use


# What new?

    LLogger LOG1 = LLogger.getLocalLogger();
    LLogger LOG2 = LLogger.getLocalLoggerWithTag("YOUR TAG");
    LLogger LOG3 = LLogger.getLocalLoggerWithTagAndMethodCount("YOUR NEW TAG", 3);

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

    //Version 1.0.2
    LLogger LOG4 = LLogger.getLocalLogger().withTag("TAG").withMethodCount(4).on();
    LLogger LOG5 = LLogger.getLocalLogger().withTag("TAG").withMethodCount(4).off();


# Installation

Add new repository to your module `build.gradle`

    repositories {
        maven {
            url "http://jcenter.bintray.com"
        }
    }

and dependencies:

    compile 'com.tuanchauict.logger:logger:1.0.2'


# License

Based on [Logger](https://github.com/orhanobut/logger) by Orhan Obut (The Apache Software License, Version 2.0). 