/*
Selection sort is in-place sorting algorithm.
Time complexity : O(n^2)
Space complexity : O(1)
*/

/*
selectionSort is a function that takes an array of numbers.
Sort them through selection sort technique. 
*/

//Author : Parixit Singh

//Sorting the array numbers
var selectionSort = function(numbersArr) {
    //Creating a copy of the array passed to the function
    var numbers = ([]).concat(numbersArr);
    for (var i = 0; i < numbers.length - 1; i++) {
        //Keeping i as the position
        var position = i;
        //finding the minimum number from the array
        for(var j = i + 1; j < numbers.length ; j++){
			if(numbers[j] < numbers[position]){
				position = j;
			}
		}
        //Inserting the value at the required position
		var temp = numbers[position];
        numbers[position] = numbers[i];
		numbers[i] = temp;
    }

    //Returning the numbers arrays
    return numbers;
};