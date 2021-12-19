<p align="center">
  <img src="https://cdn.discordapp.com/attachments/878465038346747935/919278794643210291/Team_Incredibly_Cohesive.png" />
</p>

<div align="center">
  <h1> David Chen, Jaylen Zeng, Orion Roven <h1>
</div>

## Methodology
  * Test the best case, worst case, and regular case for each method
    * The best case for linear search is first element and the best case for binary is the element at median index
    * The worst case for for linear search is the last element and the worst case for binary is if the element is not in the array
  * We used a 2d array to store all the test cases
    * We then iterate over the 2d array to test
  * Utilized instance vars to store ms for each of the trials
    * After the 5 trials for each array, the time taken was averaged and displayed


## Results
From arrays of size 10 to 100000, the times were negligible at 0ms. As the size of the arrays got larger, the times began to increase too. For an array size of 1 million, binary search took 0 ms while linear search took at most 0.2 ms. For an array size of 10,000,000, it took linear search at most 2.2 ms and took binary search 0.0 ms.

The most noticeable difference was for an array size of 100,000,000. The worst case for binary search took 0.0 ms, while the worst case for linear search took 22.8 ms.
## Conclusions
The speed for both binary search and linear search did not differ by much for the smaller-sized arrays. But for larger sized data sets, binary search is definitely the better option by demonstrating a significant speed boost.