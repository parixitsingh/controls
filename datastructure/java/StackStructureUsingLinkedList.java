/*
This program implements a stack using linked list
Stack is a data structure which follows first in last out (FiLo) OR Last in first out (LiFo)
Singly Linked list is a chain like data structure.
In Singly linked list every is aware about it's immediate node only.
*/

package parixitworkpad;

/**
 *
 * @author Parixit Singh
 */
public class StackStructureUsingLinkedList implements IDataStructureProgram {    
    private static node head = null;
    private static java.util.Scanner sc = new java.util.Scanner(System.in);  
    private class node{
        public int val ;
        public node next; 
    }
    
    @Override
    public void start(){
        System.out.println("Select the Options : ");
           int i = 1;
          while(i < 4 && i > 0){
            System.out.println("Enter 1 to insert a number : ");
            System.out.println("2 to delete : ");
            System.out.println("3 to display : ");
            System.out.println("4 to exit : ");
            i = this.getNumber();
            switch(i){
                case 1 :
                    this.insertValue(this.getNumber());
                    break;
                case 2 :
                    this.deleteValue();
                    break;
                case 3 :
                    this.printAllNumber();
                    break;
                default:
                    System.out.println("Goodbye ....Stack implementation over");
            }
          }
    }
    private int getNumber(){          
        return sc.nextInt();
    }
    
    private void insertValue(int val){
        node newNode = new node();
        newNode.val = val;
        
        if(head == null){
            newNode.next = null;
        } else {
            newNode.next = head;
        }
        head = newNode;
        System.out.println("Value inserted : " + val);
    }
    
    private void deleteValue(){
        if(head ==  null){
            System.out.println("Stack Empty");
        } else {
            head = head.next;
        }
    }
    
    private void printAllNumber(){
        node current = head;
        if(current == null){
            System.out.println("Stack Empty");
        } else {
            System.out.println("Values in stack are : ");
            while(current != null){
               System.out.println(current.val);
               current = current.next;
           }   
        }
    }
}
