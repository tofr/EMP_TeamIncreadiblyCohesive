public class SearchDriver {
  public static void main(String[] args) {
    SearchDriver driver = new SearchDriver();
    // Comparable[] arr = fillArray(10);
    // Comparable[] arr2 = fillArray(100);
    // Comparable[] arr3 = fillArray(1000);
    // Comparable[] arr4 = fillArray(10000);
    // Comparable[] arr5 = fillArray(100000);
    // Comparable[] arr6 = fillArray(1000000);
    // Comparable[] arr7 = fillArray(10000000);
    Comparable[] arr8 = fillArray(100000000);
    // Comparable[] arr9 = fillArray(1000000000);
    for (int i = 0; i < 3; i++) {
      // Test best case, worst case, and regular case
      System.out.println("Testing array of size " + arr8.length);
      SOP("----Binary Search----");
      System.out.print("Best case: " + driver.testBinSearch(arr8, 49_999_999));
      System.out.print("Worst case: " + driver.testBinSearch(arr8, 0));
      System.out.print("Regular case: " + driver.testBinSearch(arr8, 10000000));
    }
  }
  // test how fast linear search is
  public long testLinSearch(Comparable[] arr, int target) {
    long _start = System.currentTimeMillis();
    LinSearch.linSearch(arr, target);
    long _end = System.currentTimeMillis();
    long _time = _end - _start;
    System.out.println("Linear search found target in " + _time + " ms");
    return _time;
  }

  // test how fast binary search is
  public long testBinSearch(Comparable[] arr, int target) {
    long _start = System.currentTimeMillis();
    BinSearch.binSearch(arr, target);
    long _end = System.currentTimeMillis();
    long _time = _end - _start;
    System.out.println("Binary search found target in " + _time + " ms");
    return _time;
  }

  // fill array with random numbers
  public static Comparable[] fillArray(int size) {
    Comparable[] arr = new Comparable[size];
    for (int i = 0; i < size; i++) {
      arr[i] = i;
    }
    return arr;
  }

  public static void SOP(String s) {
    System.out.println(s);
  }
}
