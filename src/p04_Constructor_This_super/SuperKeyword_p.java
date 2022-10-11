package p04_Constructor_This_super;
class Parent{
	Parent(int age){
		System.out.println("Parent age is "+age);
	}
}
class Child extends Parent{
	
	Child(int age){
		super(45);
		System.out.println("Child age is "+age);
	}
}
public class SuperKeyword_p {
	public static void main(String[] args) {
		Child obj = new Child(21);
	}
}
