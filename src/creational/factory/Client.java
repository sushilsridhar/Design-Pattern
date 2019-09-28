package creational.factory;

public class Client {

        public static void main(String args[]) {
            Factory factory = new Factory();

            Product p = factory.getProduct("A");

            int price = p.getPrice();
            System.out.println(price);

        }
}
