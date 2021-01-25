package Box;

import Sweets.Sweets;

import java.util.ArrayList;
import java.util.Collections;


public class Box implements BoxInterface {

    private int boxWeight = 0;
    private int boxCost = 0;
    @Override
    public String toString() {
        return "Box{" +
                "boxWeight=" + boxWeight +
                ", boxCost=" + boxCost +
                '}';
    }



    private ArrayList<Sweets> container = new ArrayList<>();


    @Override
    public void addSweet(Sweets sweets) {
        summCostWeight(sweets.getSweetweight(), sweets.getSweetCost());

        container.add(sweets);

    }


    @Override
    public boolean removeSweet() {

        if (!container.isEmpty()) {
            int index = container.size() - 1;

            subtractionCostWeight(container.get(index).getSweetweight(), container.get(index).getSweetCost());
            container.remove(index);

            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean removeSweet(int index) {

        if (!container.isEmpty() && index < container.size()) {

            subtractionCostWeight(container.get(index).getSweetweight(), container.get(index).getSweetCost());
            container.remove(index);

            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getBoxWeight() {
        return boxWeight;
    }

    @Override
    public int getBoxCost() {
        return boxCost;
    }

    @Override
    public void getInfo() {
        System.out.println(this.toString());
        for (Sweets sweets : container) {
            System.out.println(sweets.toString());
        }

    }

    private void summCostWeight(int weight, int cost) {
        boxWeight = boxWeight + weight;
        boxCost = boxCost + cost;
    }

    private void subtractionCostWeight(int weight, int cost) {
        boxWeight = boxWeight - weight;
        boxCost = boxCost - cost;
    }


    public void optimizeBox(TypeOptimize typeOptimize, int maxvalue) {


        switch (typeOptimize) {
            case COST:

                Collections.sort(container, Sweets.costComparator);

                while (boxCost > maxvalue) {
                    removeSweet(0);
                }
                break;

            case WEIGHT:

                Collections.sort(container, Sweets.weightComparator);

                while (boxWeight > maxvalue) {
                    removeSweet(0);
                }
                break;
        }

    }

}
