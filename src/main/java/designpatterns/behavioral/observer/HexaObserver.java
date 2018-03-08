package behavioral.observer;

/**
 * Created by aignat on 5/19/2015.
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa value: " + Integer.toHexString(subject.getState()));
    }
}
