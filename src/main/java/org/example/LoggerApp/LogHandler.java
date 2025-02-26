package org.example.LoggerApp;

// ✅ OCP & DIP: Yeni log türleri eklemek için soyutlama yaptık!
interface LogHandler {
    void log(LogMessage message);
}

