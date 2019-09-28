package creational.factory;

public class Factory {

    Product product = null;

    public Product getProduct(String type) {
        if(type.equals("A")) {
            product = new ProductA();
        } else if(type.equals("B")) {
            product = new ProductB();
        }
        return product;
    }
}
