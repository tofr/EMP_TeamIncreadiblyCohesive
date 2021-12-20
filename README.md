<p align="center">
  <img src="https://cdn.discordapp.com/attachments/878465038346747935/919278794643210291/Team_Incredibly_Cohesive.png" />
</p>

<div align="center">
  <h1> David Chen, Jaylen Zeng, Orion Roven <h1>
</div>

## Methodology
  * Test the worst case for each method
    * The worst case for for linear search is the last element and the worst case for binary is if the element is not in the array
  * We used a 2d array to store all the test cases
    * We then iterate over the 2d array to test
  * Utilized instance vars to store ms for each of the trials
    * After 1000 trials for each array, the time taken was averaged and displayed
    * Instance vars would then be reset following each iteration of the main loop

## Tests Performed
  * Pserb and Co recommended us to incorporate repetition in our experiment.
    * We decided to create multiple datasets of various lengths from 100 to 200_000_000.
    * Since some of our machines lacked the required memory, we decided not to test the arrays of larger lengths in order to achieve compilability.
  * We used a for loop to iterate through each of our arrays, testing both the   bestCase and worstCase. After every array is tested, we find the average of our results.

## Results
The results were obtain from averages from 1000 trials.

From arrays of size 10 to 100000, the times were negligible at 0ms. As the size of the arrays got larger, the execution times began to increase too. For an array size of 1 million, binary search took 0 ms while linear search took 0.158 ms. For an array size of 10,000,000, it took linear search 1.965 ms and took binary search 0.0 ms.

A noticeable difference was observed for an array size of 100,000,000. The worst case for binary search took 0.001 ms, while the worst case for linear search took 19.908 ms.
For an array of size 200,000,000, it took binary search at most 0.002 while linear search took 40.947 ms.


## Conclusions
The speed for both binary search and linear search did not differ by much for the smaller-sized arrays. But for larger sized data sets, binary search is definitely the better option by demonstrating a significant speed boost.

The execution time for linear search also increases linearly, proving the concept of **Time Complexity** **O(N)**

The table below shows this correlation.

| Array Length| Time in ms for LinSearch| Time in ms for BinSearch|
| ----------- | ---------               | ---------               |
| 5000000     | 1.017                   | 0.0                     |
| 10000000    | 2.019                   | 0.0                     |
| 25000000    | 5.016                   | 0.0                     |
| 50000000    | 10.206                  | 0.0                     |
| 100000000   | 20.016                  | 0.0                     |
| 200000000   | 40.051                  | 0.0                     |


Note: The above results obtained with an AMD Ryzen 5800X. Results may vary with other systems.
