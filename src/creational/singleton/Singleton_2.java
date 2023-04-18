package creational.singleton;

public class Singleton_2 {

    // this instance variable is created when class is loaded into JVM
    // so even in multi-threaded case, only one object is created

    // if we have 50 different singleton classes, each of them are loaded int JVM and objects are created,
    // we are not sure whether all 50 objects are used, some may not be used, this is a waste of space,
    // objects can be created only when required using 'Singleton.java' approach

    final private static Singleton_2 object = new Singleton_2();

    private Singleton_2() {

    }

    public static Singleton_2 getInstance() {
        return object;
    }
}

class Client_2 {
    public static void main(String[] args) {
        Singleton_2 s1 = Singleton_2.getInstance();
        Singleton_2 s2 = Singleton_2.getInstance();
        Singleton_2 s3 = Singleton_2.getInstance();

        System.out.println("");
    }
}
