package creational.singleton;

public class SingletonClass {

    private static SingletonClass object = null;

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        if (object == null) {
            synchronized (SingletonClass.class) {
                if (object == null) {
                    object = new SingletonClass(); //instance will be created at request time
                }
            }
        }
        return object;
    }
}
