package lesson11;

public class TestGenericType<T> {

    private T[] arr;

    public TestGenericType(T... arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }

    public void swapTwoElementsArray (int index1, int index2){
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
