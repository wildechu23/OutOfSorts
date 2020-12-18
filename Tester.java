import java.util.Random;
import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
    int arraySize = 5;
    int[] data = new int[arraySize];
    Random rng = new Random();// seed of 100 is stored.

    for (int i = 0; i < arraySize; i++) {
      data[i] = rng.nextInt() % 1000;
    }

    System.out.println(Arrays.toString(data));

    Sorts.selectionSort(data);

    System.out.println(Arrays.toString(data));
  }
}
