package OOP_hw1;

public class BottleOfWater extends Product {
    private String brand;
    private String name;
    private int value;

    public BottleOfWater() {
    }

    public BottleOfWater(String inputName, double inputPrice) {
        super(inputName, inputPrice);
    }

    public BottleOfWater(String brand, String name, double price) {
        super(brand, name, price);
    }

    @Override
    public String displayInfo() {
        return null;
    }

    public BottleOfWater(String avian, String оооЭйвина, int i, int i1) {
    }
}
