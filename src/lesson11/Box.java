package lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit>{
    List<T> fruitInBox = new ArrayList<>();

    public Box(T... fruitInBox) {
        this.fruitInBox = new ArrayList<T>(Arrays.asList(fruitInBox));
    }

    public List<T> getFruitInBox() {
        return fruitInBox;
    }


    public float getWeight(){
        float totalWeight  = 0.0f;
        for (T inBox : fruitInBox) {
            totalWeight  = totalWeight  + inBox.getWeight();
        }
        return totalWeight ;
    }

    public boolean compare(Box <?> anotherBox){
        return Math.abs(getWeight() - anotherBox.getWeight()) < 0.001f;
    }


    public void addFruit(T fruit) {
        fruitInBox.add(fruit);
    }

    public void intersperseFruits(Box<T> anotherBox) {
        anotherBox.fruitInBox.addAll(this.fruitInBox);
        this.fruitInBox.clear();
    }
}
