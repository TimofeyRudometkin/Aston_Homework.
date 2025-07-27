package Homework_5_2_Chain_of_Responsibility;

import java.util.ArrayList;
import java.util.List;

public abstract class NotificationListener {
    protected List<NotificationEvent> events = new ArrayList<>();

    public void addEvent(NotificationEvent event) {
        events.add(event);
    }

    public void removeEvent(NotificationEvent event) {
        events.remove(event);
    }

    public void processNotifications() {
        for (NotificationEvent event : events) {
            event.notify();
        }
    }
}
