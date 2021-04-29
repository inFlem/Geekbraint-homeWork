package lesson11;

import java.util.*;

public class TestGenericElement<E> {
    private E[] arr;

    public TestGenericElement(E... arr) {
        this.arr = arr;
    }

    public List<E> appendToArrList(List<E> list) {
        Collections.addAll(list, arr);
        return list;
    }
}
