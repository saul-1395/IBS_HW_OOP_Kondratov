package Sweets;

import java.util.Comparator;


public abstract class Sweets  {

    protected int sweetweight;
    protected int sweetCost;
    protected String sweetName = this.getClass().getName();

    protected Sweets() {
    }

    @Override
    public String toString() {
        return "Sweets{" +
                "sweetweight=" + sweetweight +
                ", sweetCost=" + sweetCost +
                ", sweetName='" + sweetName + '\'' +
                '}';
    }

    public Sweets(int sweetweight, int sweetCost) {
        this.sweetweight = sweetweight;
        this.sweetCost = sweetCost;
    }

    public abstract int getSweetCost();
    public abstract int getSweetweight() ;



    public static Comparator<Sweets> weightComparator = new Comparator<Sweets>() {

        @Override
        public int compare(Sweets s1, Sweets s2) {
            return (int) (s1.getSweetweight() - s2.getSweetweight());
        }
    };

    public static Comparator<Sweets> costComparator = new Comparator<Sweets>() {

        @Override
        public int compare(Sweets s1, Sweets s2) {
            return (int) (s1.getSweetCost() - s2.getSweetCost());
        }
    };


}
