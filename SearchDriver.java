public class SearchDriver {
  public static void main(String[] args) {
      SearchDriver driver = new SearchDriver();
      Comparable[][] tests = new Comparable[][] {
              fillArray(100),
              fillArray(1000),
              fillArray(10000),
              fillArray(100000),
              fillArray(1000000),
              fillArray(10000000),
              fillArray(100000000),
      };
      for (int i = 0; i < tests.length; i++) {
          Comparable[] arr = tests[i];
          SOP("\n");
          SOP("-----------------Testing array of size " + arr.length + "-----------------");
          SOP("----Binary Search----");
          int bestCase = (0 + arr.length - 1) / 2;
          System.out.print("Best case: " + driver.testBinSearch(arr, bestCase) + " ms");
          System.out.print("Worst case: " + driver.testBinSearch(arr, 0) + " ms");
          System.out.print("Regular case: " + driver.testBinSearch(arr, arr.length / 8) + " ms");
          SOP("\n");
          SOP("----Linear Search----");
          System.out.print("Best case: " + driver.testLinSearch(arr, 0) + " ms");
          System.out.print("Worst case: " + driver.testLinSearch(arr, arr.length) + " ms");
          System.out.print("Regular case: " + driver.testLinSearch(arr, arr.length / 2) + " ms");

          if (i < tests.length - 1) {
              SOP("");
          }
      }
  }

  // test how fast linear search is
  public long testLinSearch(Comparable[] arr, int target) {
      long _start = System.currentTimeMillis();
      LinSearch.linSearch(arr, target);
      long _end = System.currentTimeMillis();
      long _time = _end - _start;
      return _time;
  }

  // test how fast binary search is
  public long testBinSearch(Comparable[] arr, int target) {
      long _start = System.currentTimeMillis();
      BinSearch.binSearch(arr, target);
      long _end = System.currentTimeMillis();
      long _time = _end - _start;
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
