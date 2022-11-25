# MergeTwoSortedArrays

## Project overview:

This project provides a function to combine two arrays
sorted in ascending order into one combined array, 
also in ascending order.

## The Sorting function:

The function that combines the arrays is called 
arrayMerger and can be found in the
MergeTwoSortedArrays class. The arrayMerger method 
takes into two sorted arrays of integers. Firstly, 
it creates a new array with a length equal to the 
combined lengths of the two passed in arrays. It then 
creates three int values initialised to zero to 
correspond to the indexes of the three arrays (the 
two passed in arrays and recently created array for 
the merged values). A while loop is then declared 
which checks that neither of the two passed in arrays 
have a length of zero. If this is not the case, an if 
statement is used where the condition compares the 
smallest value of each passed in array. Depending on 
value is deemed to be the smallest, the logic in 
either the if block or else block is run. The logic in 
each block is very similar and each assigns the 
current index of the new merged array to whichever 
value had been deemed the smallest out of the smallest 
values of the two passed in arrays. The int value 
used to correspond to the index of the array deemed 
to have the smallest value is then incremented in 
the if or else block. Afterwards, regardless of which 
array value was used, the int value corresponding to 
the current index of the new merged array is also 
incremented. The while loop's condition is then 
checked again and its logic will continue to run until 
one of the int values corresponding to the current 
index of the passed in arrays is greater than the 
length of that array. Once the condition of this 
while loop is met, this means that all the elements 
in at least one of the passed in arrays has been 
assigned a place in the new merged array.

Two more while loops are then used where the 
conditions check whether the int values corresponding 
to the current indexes of the passed in arrays are less 
than the lengths of their corresponding array, similar 
to before. These while loops essentially check whether 
any more elements are left in each array. This is done 
for the case that one passed in arrays length is 
longer than another, so that th remaining elements can 
be added to the new merged array. This is done by the 
logic in the while loops assigning the value at the 
current index of a passed in array to the current 
index of the new merged array, before incrementing 
both values. The while loop's condition is then 
checked again and this process repeats until the 
remaining elements are added, meaning that all 
elements of each passed in array have been accounted 
for. Finally, the new merged array is returned.

## How to run the programme:

To run the programme, execute the main function 
within the main class. This function calls the start
function from the starter class. This start function
initialises two sorted integer arrays and then prints 
them to the console. A new integer array is then 
declared with a value assigned that is the result of 
calling the arrayMerger function from the
MergeTwoSortedArrays class and passing in the two 
sorted arrays as arguments. The new merged array is 
then printed to the console. If you wish to use the 
programme to combine different arrays, you can change 
the code in the start function and pass in your 
desired arrays to the arrayMerger function.