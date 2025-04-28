package org.lld.chainOfResponsibility_designPattern;

public class WarningLogger extends Logger {

    public WarningLogger(Logger next) {
        super(next);
    }

    @Override
    protected boolean canHandle(LogLevel logLevel) {
        return logLevel == LogLevel.WARNING;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("[WARNING] " + message);
    }
}
