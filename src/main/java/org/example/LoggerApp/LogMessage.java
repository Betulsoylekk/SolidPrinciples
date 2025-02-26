package org.example.LoggerApp;

import java.time.LocalDateTime;

// ✅ SRP: Log mesajının formatını ayrı bir sınıfta yönetiyoruz
class LogMessage {
    private final String  timestamp;
    private final String level;
    private final String message;

    public LogMessage(String level, String message) {
        this.timestamp = LocalDateTime.now().toString();
        this.level = level;
        this.message = message;
    }

    public String getFormattedMessage() {
        return "[" + timestamp + "] [" + level + "] " + message;
    }
}
