import java.util.Random;
import java.util.Arrays;
public class Tester {
  public static void main(String[] args) {
    Random rng = new Random(100);// seed of 100 is stored.
    for (int i = 0; i < 5; i++) {
      System.out.println(rng.nextInt() % 1000);
    }

    int[] data = new int[5];

    rng = new Random(100);// seed of 100 is stored.
    for (int i = 0; i < 5; i++) {
      data[i] = rng.nextInt() % 1000;
    }

    System.out.println(Arrays.toString(data));

    Sorts.bubbleSort(data);

    System.out.println(Arrays.toString(data));
  }
}
