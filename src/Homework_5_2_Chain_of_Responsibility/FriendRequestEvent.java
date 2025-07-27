package Homework_5_2_Chain_of_Responsibility;

public class FriendRequestEvent implements NotificationEvent {
    private String sender;

    public FriendRequestEvent(String sender) {
        this.sender = sender;
    }

    @Override
    public void notifyEvent() {
        System.out.println(sender + " отправил запрос в друзья ");
    }
}