package org.example.LoggerApp;

class ErrorLogHandler implements LogHandler {
    @Override
    public void log(LogMessage message) {
        System.err.println(message.getFormattedMessage());
    }
}