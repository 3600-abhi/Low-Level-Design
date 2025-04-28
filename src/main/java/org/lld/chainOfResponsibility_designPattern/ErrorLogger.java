package org.lld.chainOfResponsibility_designPattern;

public class ErrorLogger extends Logger {

    public ErrorLogger(Logger next) {
        super(next);
    }

    @Override
    protected boolean canHandle(LogLevel logLevel) {
        return logLevel == LogLevel.ERROR;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("[ERROR] " + message);
    }
}
