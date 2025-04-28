package org.lld.chainOfResponsibility_designPattern;

public class InfoLogger extends Logger {

    public InfoLogger(Logger next) {
        super(next);
    }

    @Override
    protected boolean canHandle(LogLevel logLevel) {
        return logLevel == LogLevel.INFO;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("[INFO] " + message);
    }
}
