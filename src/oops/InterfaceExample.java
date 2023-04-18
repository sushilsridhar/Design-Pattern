package oops;

public class InterfaceExample {
    public static void main(String[] args) {

        Deque<Integer> stack = new LinkedLIST<>();
        Deque<Integer> stack1 = new ArrayDEQUE<>();

    }
}

// enforce a certain behaviour to be implemented,
// this interface just represents a abstract idea
interface Deque<E> {

    void push(E e);

    E pop();

    E peek();
}

class LinkedLIST<E> implements Deque<E> {

    @Override
    public void push(E e) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }
}

class ArrayDEQUE<E> implements Deque<E> {

    @Override
    public void push(E e) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }
}


