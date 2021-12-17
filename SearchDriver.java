public class SearchDriver {
  public static void main(String[] args) {
    SearchDriver driver = new SearchDriver();
    Comparable[] arr = fillArray(10000000);
    Comparable[] arr2 = fillArray(1000);
    driver.testBinSearch(arr, 2);
    driver.testLinSearch(arr, 4);
  }

  // test how fast linear search is
  public long testLinSearch(Comparable[] arr, int target) {
    long _start = System.currentTimeMillis();
    LinSearch.linSearch(arr, target);
    long _end = System.currentTimeMillis();
    long _time = _end - _start;
    System.out.println("Linear search found target in " + _time + " ms");
    return _end - _start;
  }

  // test how fast binary search is
  public long testBinSearch(Comparable[] arr, int target) {
    long _start = System.currentTimeMillis();
    BinSearch.binSearch(arr, target);
    long _end = System.currentTimeMillis();
    long _time = _end - _start;
    System.out.println("Binary search found target in " + _time + " ms");
    return _end - _start;
  }

  // fill array with random numbers
  public static Comparable[] fillArray(int size) {
    Comparable[] arr = new Comparable[size];
    for (int i = 0; i < size; i++) {
      arr[i] = (int) (Math.random() * size);
    }
    return arr;
  }
}
