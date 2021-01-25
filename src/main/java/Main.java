import Box.Box;
import Sweets.*;
import Box.TypeOptimize;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Pudding pudding = new Pudding(25, 15);
        Chocolate chocolate = new Chocolate(35, 10, TypeChocolate.BLACK);
        Pudding pudding1 = new Pudding(15, 25);
        Chocolate chocolate2 = new Chocolate(5, 38, TypeChocolate.WHITE);
        Chocolate chocolate3 = new Chocolate(18, 12, TypeChocolate.MILK);

        box.addSweet(chocolate);
        box.addSweet(chocolate2);
        box.addSweet(chocolate3);

        box.addSweet(pudding);
        box.addSweet(pudding1);

        box.getInfo();

        System.out.println();

        System.out.println(box.getBoxCost() + "  " + box.getBoxWeight());

        System.out.println(box.toString());

        box.optimizeBox(TypeOptimize.COST, 50);
       // box.optimizeBox(TypeOptimize.WEIGHT, 35);

        System.out.println(box.getBoxCost() + "  " + box.getBoxWeight());

        box.getInfo();


    }
}
