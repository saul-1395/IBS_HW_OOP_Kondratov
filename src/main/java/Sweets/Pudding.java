package Sweets;

public class Pudding extends Sweets {




    public Pudding(int sweetweight, int sweetCost) {


        super(sweetweight, sweetCost);
    }

    @Override
    public int getSweetCost() {
        return sweetCost;
    }

    @Override
    public int getSweetweight() {
        return sweetweight;
    }

    public void stinky(){
        System.out.println("It stinks a lot, but it's sweet");
    }

    @Override
    public String toString() {
        return "Pudding{" +
                "sweetweight=" + sweetweight +
                ", sweetCost=" + sweetCost +
                ", sweetName='" + sweetName + '\'' +
                '}';
    }
}
