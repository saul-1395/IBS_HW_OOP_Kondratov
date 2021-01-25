package Sweets;

public class Chocolate extends Sweets {

    protected TypeChocolate typeChocolate;


    public Chocolate(int sweetweight, int sweetCost) {


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

    public Chocolate(int sweetweight, int sweetCost, TypeChocolate typeChocolate) {

        this.typeChocolate = typeChocolate;
        this.sweetCost = sweetCost;
        this.sweetweight = sweetweight;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "typeChocolate='" + typeChocolate + '\'' +
                ", sweetweight=" + sweetweight +
                ", sweetCost=" + sweetCost +
                '}';
    }
}
