/*
 Program for queue using singly linked list
 Queue is a data structure which follow first in first out (FiFo) OR Last in last out (LiLo)
 Singly Linked list is a chain like data structure.
 In Singly linked list every is aware about it's immediate node only.
 */

package parixitworkpad;

/**
 *
 * @author Parixit Singh
 */
public class QueueUsingSinglyLinkedList implements IDataStructureProgram{
    private class node {
        public int val;
        public node next;
    }
    private static node head = null;
    private static node tail = null;
    private static java.util.Scanner sc = new java.util.Scanner(System.in); 
    
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
                    System.out.println("Goodbye ....Queue implementation over");
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
            head = newNode;
            tail = newNode;
        } else {
            head.next = newNode;
            head = newNode;
        }
        System.out.println("Value inserted : "+ val);
    }
    
    private void deleteValue(){
        if(tail != null){
            tail = tail.next;
        } else {
            System.out.println("Queue Empty");
        }
    }
    
    private void printAllNumber(){
        node current = tail;
        if(current == null){
            System.out.println("Queue Empty");
        } else {
            while(current != null){
               System.out.println(current.val);
               current = current.next;
           }   
        }
    }
}