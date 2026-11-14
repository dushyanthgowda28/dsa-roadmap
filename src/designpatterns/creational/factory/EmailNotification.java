package designpatterns.creational.factory;

public class EmailNotification implements Notification {
    @Override
    public void sendNotify() {
        System.out.println("Email Notification");
    }
}
