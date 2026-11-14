package designpatterns.creational.factory;

public class SMSNotification implements Notification {
    @Override
    public void sendNotify() {
        System.out.println("SMS Notification");
    }
}
