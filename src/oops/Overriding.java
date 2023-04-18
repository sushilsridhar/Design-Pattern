package oops;

public class Overriding {
    public static void main(String[] args) {

    }
}

class Test extends Overriding {
    // no use of overloading or overriding static methods,
    // because they are always called with Class name

    public static void main(String[] args) {

    }
}

class Math {

    public void sub(int a, int b) {

    }
}

class Subtract extends Math {

    // overloading
    public void sub(int a) {

    }

    // overriding - access modifier must be same or more freedom
    @Override
    public void sub(int a, int b) {

    }
}