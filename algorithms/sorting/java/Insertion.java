/*
Insertion sort is in-place sorting algorithm.
Time complexity : O(n^2)
Space complexity : O(1)
*/

/*
This program gets 10 numbers from user.
Sort them through insertion sort technique. 
*/

//Author : Parixit Singh
import java.util.*;

public class Insertion {
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the total 10 numbers");
            int[] numbers = new int[10];

            //Getting 10 numbers from command line interface
            for(int i = 0 ; i < 10 ; i++){
                numbers[i] = sc.nextInt();
            }

            //Sorting the array numbers
            for(int i = 0 ; i < 10; i++){
                //Keeping the value at the i position, and i as the position
                int value = numbers[i], position = i;

                //Checking the position and comparing the value 
                //Here shifting of the numbers taking place
                //Values that are greater are shifted one index down
                while((position > 0) && (numbers[position - 1] > value)){
                    numbers[position] = numbers[position - 1];
                    position = position - 1;
                }

                //Inserting the value at the required position
                numbers[position] = value;
            }

            //Printing the sorted values
            for(int i = 0; i < 10 ; i++){
                System.out.printf(numbers[i] + " ");
            }
        } catch(Exception e){
            System.out.println("Exception : " + e);
        }
    }
}