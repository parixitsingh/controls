/*
 * Inheritance example
 * Child class
 */

/**
 *
 * @author Parixit Singh
 */
class Parent {
	Parent(){
		System.out.println("I am Parent");
	}

	public void PrintName(){
		System.out.println("My name is Parent");
	}
}

class Child extends Parent {
	Child(){
		System.out.println("I am Child");
	}

	public static void main(String[] args){
		Child c = new Child();
		c.PrintName();
	}
}
