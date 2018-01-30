/*
Program to run data structure programs
 */

package parixitworkpad;

/**
 *
 * @author Parixit Singh
 */
public class DataStructureDriver {
    private static java.util.Scanner sc = new java.util.Scanner(System.in); 
    public static void main(String args[]){  
        try {
           Start();
        } catch(Exception e){
            System.out.println("Oops you messed up ...Goodbye");
        }          
    }
    
    public static void Start(){
        IDataStructureProgram ss;
        int i = 1;
        
        while(i > 0 && i < 3){
            System.out.println("Welcome to the programming of Data structure");
            System.out.println("Please enter the choice : ");
            System.out.println("Enter 1 to run program for Stack using linked list : ");
            System.out.println("Enter 2 to run program for Queue using linked list : ");
            System.out.println("Any other number to exit");
            i = sc.nextInt();
            
            switch(i){
                case 1:
                    ss = new StackStructureUsingLinkedList();
                    ss.start();
                    break;
                case 2:
                    ss = new QueueUsingSinglyLinkedList();
                    ss.start();
                    break;
                default:
                    System.out.println("Goodbye....Happy Learning");
                    break;
            }            
        }
    }
    
}


