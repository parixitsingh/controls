/*
 * Binary Search is an algorithm that works on sorted data
 * In this program an array of sorted number is used to explain the algorithm
 */

package parixitworkpad;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Parixit Singh
 */
public class BinarySearch {
	private static int[] numbers;
	private static Scanner sc = new Scanner(System.in); 
    public static void main(String args[]){
    	try {
	    	numbers = new int[1000];
	  		Random rn = new Random();
	     	for(int i = 0; i < 1000; i++){
	     		numbers[i] = rn.nextInt(1000);
	     	}

	     	//Sorting of array
	     	for(int i = 0; i < 1000; i++){
	     		for(int j = i; j < 1000; j++){
		     		if(numbers[i] > numbers[j]){
		     			int temp = numbers[i];
		     			numbers[i] = numbers[j];
		     			numbers[j] = temp;
		     		}
		     	}
	     	}
	    	BinarySearch bs = new BinarySearch();
	    	bs.Start();
    	} catch(Exception e){
    		System.out.println("Error occured : " + e);
    	}
    }

    private void Start(){
    	System.out.println("Welcome to Binary Search of numbers");
    	System.out.println("You have an array of size 1000 containing random numbers from 0-1000");
    	System.out.print("Enter the number to search : ");
    	int i = this.getNumber();
    	this.Search(i);
    }

    private void Search(int num){
    	int count = this.SearchArray(num, 0, numbers.length - 1);
    	if(count != 0){
    		System.out.println("Total number of iterations : " + count);
    	}
    }

    private int SearchArray(int num, int startIndex, int endIndex){
    	if(startIndex <= endIndex){
    		int middle = startIndex + (endIndex - startIndex)/2;
    		int result = 0;
    		if(numbers[middle] == num){
    			System.out.println("Number index is  : " + middle);
    			result = 1;
    		} else if(numbers[middle] > num){
    			result = 1 + SearchArray(num, startIndex, middle - 1);
    		} else {
    			result = 1 + SearchArray(num, middle + 1, endIndex);
    		}
    		return result;
    	} else {
    		System.out.println("Number doesn't exist in array");
    		return 0;
    	}
    }

    private int getNumber(){          
        return sc.nextInt();
    }
}
