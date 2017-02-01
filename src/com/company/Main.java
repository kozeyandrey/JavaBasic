package com.company;

public class Main {

	int exVar = 5;

//	A static method can access only static data. It can not access non-static data (instance variables)
//	A static method can call only other static methods and can not call a non-static method from it.
//	A static method can be accessed directly by the class name and doesn’t need any object
    public static void main(String[] args) {
	    String myName = "Andrew";
	    float favoriteNumber = 7;
	    System.out.println(myName + "'s favorite number is " + favoriteNumber);

	    Main.exampleStatic();

	    Main newObj = new Main();
	    newObj.exampleNotVoidMethod("exampleNotVoidMethod");
		newObj.exVar++;
	    System.out.println(newObj.exVar);
		newObj.exampleMethod();
	}

    public void exampleMethod() {
		System.out.println("exampleMethod");
		System.out.println(exVar);
	}

	public String exampleNotVoidMethod(String message) {
		System.out.println(message);
		return "all works fine";
	}

    public static void exampleStatic() {
    	System.out.println("exampleStatic");
	}
}
