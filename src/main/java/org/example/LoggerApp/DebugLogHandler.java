package org.example.LoggerApp;

// ✅ OCP'ye uygun: Yeni bir log türü eklemek için kodu değiştirmek yerine sadece yeni bir sınıf yazıyoruz.
class DebugLogHandler implements LogHandler {
    @Override
    public void log(LogMessage message) {
        System.out.println("[DEBUG] " + message.getFormattedMessage());
    }
}