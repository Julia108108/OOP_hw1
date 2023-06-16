package OOP_hw1;

public abstract class Product {

    protected String name;
    protected String brand;
    protected double price;
    protected double volume;
    //protected double volume;

    public void setPrice(double inputPrice) {
        checkPrice(inputPrice);
    }

    public Product() {
        this("product", 100);
    }

    public Product(String inputName, double inputPrice) {
        this("noname", inputName, inputPrice);
    }
    public Product(String brand, String name, double price){
        checkPrice(price);
        if (name.length() < 5){
            this.name = "product";
        }
        else {
            this.name = name;
        }
        this.brand = brand;


    }

    private void checkPrice(double inputPrice){
        if (inputPrice <= 0){
            price = 100;
        }
        else {
            price = inputPrice;
        }
    }


    @Override
    public String toString() {
        return String.format("%s - %s- %f", name, brand, price);
    }

    public abstract String displayInfo();
}
