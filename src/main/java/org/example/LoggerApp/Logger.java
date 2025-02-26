package org.example.LoggerApp;

// ✅ DIP: Logger artık bağımlılığı soyutlamalar üzerinden alıyor!
class Logger {
    private LogHandler logHandler;

    public Logger(LogHandler logHandler) {
        this.logHandler = logHandler;
    }

    public void log(String message, String level) {
        LogMessage logMessage = new LogMessage(level, message);
        logHandler.log(logMessage);
    }
}

