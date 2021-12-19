public class SearchDriver {
    private int binaryBest = 0;
    private int binaryWorst = 0;

    private int linearBest = 0;
    private int linearWorst = 0;
    private static int trials = 1000;
    public static void main(String[] args) {
        SearchDriver driver = new SearchDriver();
        // use 2d array to store the test cases
        Comparable[][] tests = new Comparable[][] {
                fillArray(100),
                fillArray(1000),
                fillArray(10000),
                fillArray(100000),
                fillArray(1000000),
                fillArray(10000000),
                fillArray(100000000),
                fillArray(200000000),
        };

        for (int i = 0; i < tests.length; i++) {
            Comparable[] arr = tests[i];
            int bestCase = (0 + arr.length - 1) / 2;
            int worstCase = arr.length + 1;
            SOP("\n");
            SOP("-----------------Testing array of size " + arr.length + "-----------------");
            for (int j = 0; j < trials; j++) {
                driver.binaryBest += driver.testBinSearch(arr, bestCase);
                driver.binaryWorst += driver.testBinSearch(arr, worstCase);

                driver.linearBest += driver.testLinSearch(arr, 0);
                driver.linearWorst += driver.testLinSearch(arr, arr.length);
            }

            SOP("----Binary Search----");
            print("Best case: " + calculateAvg(driver.binaryBest) + " ms \n");
            print("Worst case: " + calculateAvg(driver.binaryWorst) + " ms \n");

            SOP("\n");
            SOP("----Linear Search----");
            print("Best case: " + calculateAvg(driver.linearBest) + " ms \n");
            print("Worst case: " + calculateAvg(driver.linearWorst) + " ms \n");
            
            driver.reset();
            if (i < tests.length - 1) {
                SOP("");
            }
        }
    }

    public static float calculateAvg(int sum) {
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
            arr[i] = i;
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
        binaryBest = 0;
        binaryWorst = 0;

        linearBest = 0;
        linearWorst = 0;
    }
}
