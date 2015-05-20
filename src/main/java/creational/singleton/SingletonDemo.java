package creational.singleton;

/**
 * Created by aignat on 5/11/2015.
 */
public class SingletonDemo {

    public static void main(String[] args) {

        System.out.println(Administrator.getAdministratorInstance());
        System.out.println(Administrator.getAdministratorInstance());
        System.out.println(Administrator.getAdministratorInstance());
    }

}
