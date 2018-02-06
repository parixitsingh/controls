/*
Insertion sort is in-place sorting algorithm.
Time complexity : O(n^2)
Space complexity : O(1)
*/

/*
insertionSort is a function that takes an array of numbers.
Sort them through insertion sort technique. 
*/

//Author : Parixit Singh

//Sorting the array numbers
var insertionSort = function(numbersArr) {
    //Creating a copy of the array passed to the function
    var numbers = ([]).concat(numbersArr);
    for (var i = 0; i < numbers.length; i++) {
        //Keeping the value at the i position, and i as the position
        var value = numbers[i],
            position = i;
        //Checking the position and comparing the value 
        //Here shifting of the numbers taking place
        //Values that are greater are shifted one index down
        while ((position > 0) && (numbers[position - 1] > value)) {
            numbers[position] = numbers[position - 1];
            position--;
        }
        //Inserting the value at the required position
        numbers[position] = value;
    }

    //Returning the numbers arrays
    return numbers;
};