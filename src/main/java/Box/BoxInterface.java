package Box;

import Sweets.Sweets;

public interface BoxInterface {


    void addSweet(Sweets sweets);
    //я не понял, почему он заставил меня создать второй метод, я понял, что он перегружен...

    boolean removeSweet();

    boolean removeSweet(int index);

    int getBoxWeight();

    int getBoxCost();

    void getInfo();
}
