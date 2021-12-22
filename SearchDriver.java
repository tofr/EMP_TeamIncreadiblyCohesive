public class SearchDriver {
    private static int trials = 1000;
        private long binaryWorst, linearWorst;
    public static void main(String[] args) {
        SearchDriver driver = new SearchDriver();
        // use 2d array to store the test cases
        Comparable[][] tests = new Comparable[][] {
                fillArray(100),
                fillArray(1000),
                fillArray(10000),
                fillArray(100_000),
                fillArray(1_000_000),
                fillArray(5_000_000),
                fillArray(10_000_000),
                fillArray(25_000_000),
                // fillArray(50_000_000),
                // fillArray(100_000_000),
                // fillArray(200_000_000),
        };

        for (Comparable[] test : tests) {
            int worstCase = test.length + 1;
            SOP("\n");
            SOP("-----------------Testing array of length " + test.length + "-----------------");
            for (int j = 0; j < trials; j++) {
                driver.binaryWorst += driver.testBinSearch(test, worstCase);

                driver.linearWorst += driver.testLinSearch(test, test.length);
            }

            SOP("----Binary Search----");
            print("Worst case: " + calculateAvg(driver.binaryWorst) + " ms \n");

            SOP("\n");
            SOP("----Linear Search----");
            print("Worst case: " + calculateAvg(driver.linearWorst) + " ms \n");

            driver.reset();
            SOP("");
        }
    }

    public static float calculateAvg(long sum) {
        return (float) sum / trials;
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

    public static Comparable[] fillArray(int size) {
        Comparable[] arr = new Comparable[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i * 10;
        }
        return arr;
    }

    public static void SOP(String s) {
        System.out.println(s);
    }

    public static void print(String s) {
        System.out.print(s);
    }

    public void reset() {
        binaryWorst = 0;

        linearWorst = 0;
    }
}
