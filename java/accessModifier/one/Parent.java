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
		//Default constructor
	}

	//Parameterized constructor
	public Parent(String message){
		System.out.println(message);
	}

	public void PrintName(){
		System.out.println("My name is Parent");
	}
}