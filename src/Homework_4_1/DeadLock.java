package Homework_4_1;

public class DeadLock {
    private final String name;

    public DeadLock(String name){
        this.name=name;
    }

    public String getName(){
        return  this.name;
    }

    public synchronized void DoFirst(DeadLock deadLock) {
        System.out.format("%s: %s Do First!%n",this.name, deadLock.getName());

    }

    public synchronized void DoSecond(DeadLock deadLock) {
        System.out.format("%s: %s Do Second!%n",this.name, deadLock.getName());

    }
}
