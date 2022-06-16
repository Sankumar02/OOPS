package com.oops;

//Textual representation how an object look like in a memory.
//whatever we write in a class is in actual belongs property of object as we are describing the object. 
//So if we want anything belong to class make it static.
class Automobile {

	// Attributes(State)
	// 2.if we don't want write the data directly we can make attributes as
	// private,having private attributes we are limiting the user not to write the
	// data directly
	// 2.so we cannot access attributes marked as private
	// 2.if i make int as private --->
	private int vechicleId;
	
	String vechicleType;
	String name;
	int price;

	// constructor--> default constructor.
	Automobile() {
		System.out.println(">>Automobile object constructed");
	}

	// to write data in the Automobile object, i'm using this method.
	// Method(Behavior)
	// writeAutomobileProductDetails-->write details into the Automobile object.
	void writeAutomobileDetails(int vechicleId, String vechicleType, String name, int price) {
		this.vechicleId = vechicleId;
		this.vechicleType = vechicleType;
		this.name = name;
		this.price = price;
		System.out.println(">>Data written in the Automobile object");
	}

	// to read data from the Automobile object.
	void showAutomobileDetails() {
		System.out.println("------------AutomobileId:" + vechicleId + "--------------");
		System.out.println("Automobile Type:" + vechicleType);
		System.out.println("Automobile Name:" + name);
		System.out.println("Automobile Price:" + price);
		System.out.println();
	}

	// setters- is used when we have attributes marked as private.
	void setvechicleId(int vechicleId) {
		this.vechicleId = vechicleId;// 'this' means it refer to current object
		// LHS-vechicleId belongs to object and RHS-vechicleId belong to method
		// setvechicleId

	}

	// getters- is used when we have attributes marked as private.
	int getvechicleId() {
		return vechicleId;
	}
}


public class Inheritance {

	// main is executed by JVM when my program will run.
	public static void main(String[] args) {

	
		// creating an object for Automobile
		// automobile is not an object.its a reference variable that holds the hashcode
		// of the object in hexdecimal notation.
		// Automobile is the object construction statement.
		Automobile automobile = new Automobile();

		// System.out.println("Automobile is "+automobile);//@5e265ba4 this is a
		// hashcode. so automobile is a ref. variable not an object.

		// writing data in Automobile object
		automobile.writeAutomobileDetails(3, "Two Wheeler", "Yamaha", 80000);

		// reading data from the Automobile object
		automobile.showAutomobileDetails();

		// 2.we can also write data directly like,!!
		// 2.for this we have to create another object Automobile
		Automobile automobile1 = new Automobile();
		// automobile1.vechicleId=4;//2.we are getting an error here,so we cannot access
		// attributes marked as private
		automobile1.setvechicleId(2);
		automobile1.vechicleType = "Four Wheeler";
		automobile1.name = "Tata Harrier";
		automobile1.price = 2500000;

		// 2.reading data from the Automobile object
		automobile1.showAutomobileDetails();
		
	
		
	
	}

}
