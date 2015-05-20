package behavioral.observer;

/**
 * Created by aignat on 5/19/2015.
 */
public abstract class Observer {

    protected Subject subject;
    public abstract void update();
}
