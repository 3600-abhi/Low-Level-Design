package org.lld.chainOfResponsibility_designPattern;

public class LoggingExample {
    public static void main(String[] main) {
        Logger logger = new InfoLogger(new WarningLogger(new ErrorLogger(null)));

        logger.log(LogLevel.ERROR, "Something went wrong!!");
        logger.log(LogLevel.WARNING, "Something went wrong!!");
        logger.log(LogLevel.INFO, "Something went wrong!!");
    }
}
