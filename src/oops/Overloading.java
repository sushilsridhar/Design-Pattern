package oops;

public class Overloading {

    public static void main(String[] args) {

        Add a = new Add();
        a.add(10, "hello");
    }

    public static void main(String args) {

    }
}

class Add {
    private void add(int a, int b) {}
    private void add(int a, int b, int c) {}

    public void add(int a, String b) {
        add(10, 20);
    }
    public void add(String a, int b) {
        add(10, 20, 30);
    }
}


