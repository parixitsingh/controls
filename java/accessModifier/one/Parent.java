package one;
public class Parent {

	//Private member
	private int privateMember = 10;

	//Protected member 
	protected int protectedMember = 20;

	//Default member
	int defaultMember = 30;

	//Public member
	public int publicMember = 40;


	public Parent(){
		//System.out.println("Parent Created");
	}

	public void PrintName(){
		System.out.println("My name is Parent");
	}
}