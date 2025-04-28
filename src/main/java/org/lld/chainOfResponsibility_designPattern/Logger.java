package org.lld.chainOfResponsibility_designPattern;

public abstract class Logger {
    protected Logger next;

    public Logger(Logger next) {
        this.next = next;
    }

    public void log(LogLevel logLevel, String message) {
        if (canHandle(logLevel)) {
            writeMessage(message);
        } else if (next != null) {
            next.log(logLevel, message);
        }
    }

    protected abstract boolean canHandle(LogLevel logLevel);

    protected abstract void writeMessage(String message);
}
