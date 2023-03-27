package org.example.FactoryMethod;

public class Main {
    public static void main(String[] args) {
    NotificationFactory uwu = new NotificationFactory();
    Notification notification = uwu.createNotification("SMS");
    notification.notifyUser();
    }
}