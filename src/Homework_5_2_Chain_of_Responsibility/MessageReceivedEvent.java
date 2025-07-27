package Homework_5_2_Chain_of_Responsibility;

public class MessageReceivedEvent implements NotificationEvent {
    private String sender;
    private String message;

    public MessageReceivedEvent(String sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    @Override
    public void notifyEvent() {
        System.out.println("Новое сообщение от " + sender + ": " + message);
    }
}