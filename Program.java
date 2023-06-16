package OOP_hw1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        /*
        Создать новый продукт на основе Product, создать ему хотя бы одно
        свойство (например, шоколад и калории) и включить в список продуктов
        в вендинг машину.
        Продемонстрировать работу класса по продаже товаров.
         */

        Product bottle1 = new BottleOfWater("Байкал", "ООО Байкал", 100, (int) 1.5);
        Product bottle2 = new BottleOfWater("Avian", "ООО Эйвина", 150, 1);
        Product bottle3 = new BottleOfMilk("EcoNiva", "ООО Эконива", 80, 1);
        Product bottle4 = new BottleOfMilk("Goodmilk", "ООО Гудмилк", 90, (int) 1.5);
        Product bar1 = new BarOfChocolate ("Алёнка", "Шоколад", 100, 9, 5, "milk");
        Product bar2 = new BarOfChocolate ("Ваня", "Шоколад", 100, 9, 5, "milk");

        List<Product> products = new ArrayList<>();
        products.add(bottle1);
        products.add(bottle2);
        products.add(bottle3);
        products.add(bottle4);
        products.add(bar1);
        products.add(bar2);

        VendingMachine vendingMachine = new VendingMachine(products);

        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(2);
        if (bottleOfWaterResult != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterResult.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }
    }

}
