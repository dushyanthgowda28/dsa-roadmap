package designpatterns.creational.factory;

public class Main {

    public static void main(String[] args) {
        NotificationFactory emailNotificationFactory = new EmailNotificationFactory();
        Client client1 = new Client(emailNotificationFactory.createNotification());
        client1.initiateNotification();

        NotificationFactory smsNotificationFactory = new SMSNotificationFactory();
        Client client2 = new Client(smsNotificationFactory.createNotification());
        client2.initiateNotification();
    }
}
