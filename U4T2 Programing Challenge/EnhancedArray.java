import java.util.Arrays;

public class EnhancedArray {
  /** ==========Enhanced Array==========
   * We know that arrays have a fixed size, but we want to create a dynamic array 
   * that can grow and shrink as needed. This is called a dynamic array.
   * You must complete the following methods:
   * 1. size(): Returns the current number of elements in the array.
   * 2. getVal(int index): Returns the value at the specified index, 
   * or -1 if the index is out of bounds.
   * 3. add(int val): Adds a value to the end of the array.
   * 4. insert(int index, int val): Inserts a value at the specified index, 
   * shifting subsequent elements to the right. If index is out of bounds, print "Index invalid".
   * 5. remove(int index): Removes the value at the specified index, shifting subsequent 
   * elements to the left and returning the removed value.If the index is out of bounds, return -1.
   * 
   * There is some code in the main method to help you test your code.
   * 
   * **/
  private int size;
  private int[] data;

  public EnhancedArray(int size) {
    data = new int[size];
    this.size = size;
      }

  public int size() {
    return size;
  }

  public int getVal(int index) {
    if (index >= data.length) {
      return -1;
    }
    return data[index];
  }

  public void add(int val) {
    data = Arrays.copyOf(data, data.length + 1);
    data[data.length - 1] = val;
    size ++;
  }

  public void insert(int index, int val) {
    if (index >= data.length) {
      System.out.println("Index invalid");
    } else {
      int[] copy = new int[data.length + 1];
      for (int i = 0; i < index; i++) {
        copy[i] = data[i];
      }
      copy[index] = val;
       for (int i = index; i < data.length; i++) {
        copy[i + 1] = data[i];
      }
      size ++;
      data = new int[copy.length];
      for (int i = 0; i < copy.length; i ++) {
        data[i] = copy[i];
      }
    }
  }

  public int remove(int index) {
    if (index >= data.length) {
      return -1;
    }
    int remove = data[index];
     for (int i = index; i < data.length; i++) {
        if (i == data.length - 1) {
        } else {
            data[i] = data[i + 1];
        }
     }
     data = Arrays.copyOf(data, data.length - 1);
     size --;
   return remove;
  }

  public static void main(String[] args) {
     EnhancedArray a = new EnhancedArray(0);
     System.out.println("Initial size expected 0: " + a.size());

     a.add(10);
     a.add(20);
     a.add(30);
     System.out.print("After adds expected [10, 20, 30]: ");
     for (int i = 0; i < a.size(); i++) {
       System.out.print((" " + a.getVal(i)));
     }
     System.out.println();

     a.insert(1, 15);
     System.out.print("After insert expected [10, 15, 20, 30]: ");
     for (int i = 0; i < a.size(); i++) {
       System.out.print(" "+ a.getVal(i));
     }
     System.out.println();

     int removed = a.remove(2);
     System.out.println("Removed expected 20: " + removed);
     System.out.print("After remove expected [10, 15, 30]: ");
     for (int i = 0; i < a.size(); i++) {
       System.out.print(" " + a.getVal(i));
     }
     System.out.println();

     System.out.println("getVal(1) expected 15: " + a.getVal(1));
     System.out.println("getVal(10) expected -1: " + a.getVal  (10));
  }
}