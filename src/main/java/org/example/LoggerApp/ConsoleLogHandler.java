package org.example.LoggerApp;

// ✅ Yeni Log Türleri Eklenebilir
class ConsoleLogHandler implements LogHandler {
    @Override
    public void log(LogMessage message) {
        System.out.println(message.getFormattedMessage());
    }
}
