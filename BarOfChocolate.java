package OOP_hw1;

public class BarOfChocolate extends Product{

    private double calories;

    public BarOfChocolate(String ваня, String шоколад, int calories, int volume, int i, String milk) {
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public BarOfChocolate(String named, String brand, double Calories, double volume) {
        super(brand, volume);
        this.calories = calories;
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка]%s - %s - %f - [объем: %f]", name, brand, price, volume);
    }
}


