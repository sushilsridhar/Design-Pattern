package structural.adaptor;

public class Client  {

    public static void main(String [] args) {
        AdaptorInterface adaptorInterface = new Adaptor();

        adaptorInterface.request(5);
    }
}
