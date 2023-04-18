package creational.singleton;

public class Singleton {

    private static Singleton object = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (object == null) {  // double checked locking for thread safety
            synchronized (Singleton.class) {
                if (object == null) {
                    object = new Singleton(); //instance will be created at request time
                }
            }
        }
        return object;
    }
}

class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println("");
    }
}