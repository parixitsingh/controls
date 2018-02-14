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
		//System.out.println("Child Created");
	}

	public void PrintName(){
		System.out.println("My name is Child");
	}

	public static void main(String[] args){
		//Reference of Child and Object of Child
		Child c = new Child();
		c.PrintName();

		//Reference of Parent and Object of Child
		Parent c1 = new Child();
		c1.PrintName();

		//Reference of Parent and Object of Parent
		Parent p = new Parent();
		p.PrintName();


		//Child object assigned to Parent reference
		p = c;

		//Child object referenced by Parent is type casted into child reference
		Child c2 = (Child) p;
		c2.PrintName();
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
