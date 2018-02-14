/*
 * Inheritance example
 * Child class
 */

/**
 *
 * @author Parixit Singh
 */

package two;
import one.*;

public class Child extends Parent {
	public Child(){
		System.out.println("I am Child");
	}

	public static void main(String[] args){
		Child c = new Child();
		c.PrintName();

		// //Trying to access private member of parent
		// try {
		// 	System.out.println(c.privateMember);
		// } catch(Exception e){
		// 	System.out.println("Error while accessing parent private member" + e);
		// }

		//Trying to access protected member of parent
		try {
			System.out.println(c.protectedMember);
		} catch(Exception e){
			System.out.println("Error while accessing parent protected member" + e);
		}

		// //Trying to access default member of parent
		// try {
		// 	System.out.println(c.defaultMember);
		// } catch(Exception e){
		// 	System.out.println("Error while accessing parent default member" + e);
		// }

		//Trying to access public member of parent
		try {
			System.out.println(c.publicMember);
		} catch(Exception e){
			System.out.println("Error while accessing parent public member" + e);
		}
	}
}
