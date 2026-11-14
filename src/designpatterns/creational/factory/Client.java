package designpatterns.creational.factory;

public class Client {
    Notification notification;

    public Client(Notification notification) {
        this.notification = notification;
    }

    public void initiateNotification() {
        notification.sendNotify();
    }
}
