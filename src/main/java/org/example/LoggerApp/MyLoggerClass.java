package org.example.LoggerApp;

// Test
public class MyLoggerClass {
    public static void main(String[] args) {
        Logger infoLogger = new Logger(new ConsoleLogHandler());
        Logger errorLogger = new Logger(new ErrorLogHandler());
        Logger debugLogger = new Logger(new DebugLogHandler());

        infoLogger.log("Application started", "INFO");
        errorLogger.log("Something went wrong!", "ERROR");
        debugLogger.log("Debugging data", "DEBUG");

        // Yeni bir log türü eklemek istiyorsak, sadece yeni bir LogHandler sınıfı yazmamız yeterli!
    }
}
