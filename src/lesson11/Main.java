package lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TestGenericType<Integer> ints = new TestGenericType<>(1,2,3,4,5,6);
        ints.swapTwoElementsArray(1,5);
        System.out.println(Arrays.toString(ints.getArr()));


        TestGenericElement<String> str = new TestGenericElement<>("1", "2", "3", "4");
        List<String> arrayList = new ArrayList<>();
        System.out.println(str.appendToArrList(arrayList));


        Box<Apple> boxApple = new Box<>(new Apple());
        boxApple.addFruit(new Apple());
        boxApple.addFruit(new Apple());
        Box<Orange> boxOranges = new Box<>(new Orange());
        boxOranges.addFruit(new Orange());
        boxOranges.addFruit(new Orange());
        boxOranges.addFruit(new Orange());
        Box<Apple> newBoxApple = new Box<>();
        System.out.println("Вес коробки с яблоками: " + boxApple.getWeight());
        System.out.println("Вес коробки с апельсинами: " + boxOranges.getWeight());
        System.out.println("Сравнение текущей коробки: " + boxOranges.compare(boxApple));
        boxApple.intersperseFruits(newBoxApple);
        System.out.println(boxOranges.getFruitInBox());
        System.out.println(newBoxApple.getFruitInBox());

    }

}




