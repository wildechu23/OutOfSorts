public class Sorts{
  /**Bubble sort of an int array. 
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){ 
    boolean swapped = true;
    for(int i = 0; i < data.length && swapped; i++) {
      swapped = false;
      for(int j = 0; j < data.length-i-1; j++) {
        if(data[j] > data[j+1]) {
          swap(data, j, j+1);
          swapped = true;
        }
      }
    } 

  }

  public static void selectionSort(int[] data) {
    for(int i = 0; i < data.length; i++) {
      int minimum = i;
      for(int j = i; j < data.length; j++) {
        if(data[j] < data[minimum]) {
          // System.out.println(data[j] + " at " + j + " is less than " + data[minimum] + " at " + minimum);
          minimum = j;
        }
      }
      // System.out.println("Swapping " + data[minimum] + " and " + data[i]);
      swap(data, minimum, i);
    }
  }

  public static void insertionSort(int[] data) {
    for(int i = 0; i < data.length; i++) {
      int current = data[i];
      int j = i - 1;
      while(j >= 0 && data[j] > current) {
        data[j+1] = data[j];
        j--;
      }
      data[j+1] = current;
    }
  }

  private static void swap(int[] data, int index1, int index2) {
    int temp = data[index1];
    data[index1] = data[index2];
    data[index2] = temp;
  }
}