package network;

public class Main {

    public static void main(String[] args) {

    }

    private static int square(int a) { return a * a; }

    private static int getElementByIndex(int index, int[] arr) {

        if ((index < 0 && arr.length + index < 0) || index > arr.length - 1)
            throw new ArrayIndexOutOfBoundsException();

        return (index >= 0) ? arr[index] : arr[arr.length + index];
    }
}
