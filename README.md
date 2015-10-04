This is a hacked version of [Logger by Orhan Obut](https://github.com/orhanobut/logger).

# What have been changed in this hacked?

    Logger.v        -->      SLogger.v
    Logger.d        -->      SLogger.d
    Logger.i        -->      SLogger.i
    Logger.w        -->      SLogger.w
    Logger.e        -->      SLogger.e
    Logger.wtf      -->      SLogger.wtf
    Logger.json     -->      SLogger.json
    Logger.xml      -->      SLogger.xml


Q: Are you joking?

A: Er, Nope!

Q: What's new dude?

# What new?

    Logger LOG1 = Logger.getLocalLogger();
    Logger LOG2 = Logger.getLocalLoggerWithTag("YOUR TAG");
    Logger LOG3 = Logger.getLocalLoggerWithTagAndMethodCount("YOUR NEW TAG", 3);

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


# Installation

Just pull this project and add it into your project. Sorry, I haven't published on Maven yet.


