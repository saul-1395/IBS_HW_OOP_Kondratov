package Sweets;

public class Pudding extends Sweets {



    public Pudding(int sweetweight, int sweetCost) {
        super(sweetweight, sweetCost);
    }

    @Override
    public int getSweetCost() {
        return 0;
    }

    @Override
    public int getSweetweight() {
        return 0;
    }

    public void stinky(){
        System.out.println("It stinks a lot, but it's sweet");
    }
}
