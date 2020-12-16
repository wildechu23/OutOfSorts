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

  private static void swap(int[] data, int index1, int index2) {
    int temp = data[index1];
    data[index1] = data[index2];
    data[index2] = temp;
  }
}