package creational.singleton;

/**
 * Created by aignat on 5/11/2015.
 */
public class Administrator {

    private static Administrator administratorInstance = new Administrator();

    private Administrator() {
    }

    public static Administrator getAdministratorInstance() {

        return administratorInstance;
    }

}
