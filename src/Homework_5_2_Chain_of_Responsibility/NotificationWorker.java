package Homework_5_2_Chain_of_Responsibility;

public class NotificationWorker extends NotificationListener {
    @Override
    public void processNotifications() {
        super.processNotifications();
        System.out.println("Все уведомления обработаны");
    }
}
