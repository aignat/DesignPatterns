package behavioral.observer;

/**
 * Created by aignat on 5/19/2015.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary value: " + Integer.toBinaryString(subject.getState()));
    }
}
