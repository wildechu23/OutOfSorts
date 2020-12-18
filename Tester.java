import java.util.Random;
import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
    int arraySize = 20;
    int[] data = new int[arraySize];
    Random rng = new Random(200);// seed of 100 is stored.

    for (int i = 0; i < arraySize; i++) {
      data[i] = rng.nextInt() % 1000;
    }

    System.out.println(Arrays.toString(data));

    Sorts.bubbleSort(data);

    System.out.println(Arrays.toString(data));
  }
}
