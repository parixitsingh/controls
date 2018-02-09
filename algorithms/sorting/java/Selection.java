/*
Selection sort is in-place sorting algorithm.
Time complexity : O(n^2)
Space complexity : O(1)
*/

/*
This program gets 10 numbers from user.
Sort them through selection sort technique. 
*/

//Author : Parixit Singh
import java.util.*;

public class Selection {
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
            for(int i = 0 ; i < 10 - 1; i++){
                //Keeping the value at the i position, and i as the position
                int position = i;

                //finding the minimum number
                for(int j = i + 1; j < 10; j++){
                    if(numbers[j] < numbers[position]){
                        position = j;
                    }
                }

                //Inserting the value at the required position
                int temp = numbers[position];
                numbers[position] = numbers[i];
                numbers[i] = temp;
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