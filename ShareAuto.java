package com.oops;

class ShareAuto extends Automobile 
//IS-A relationship. ShareAuto is the Automobile.
//Here ShareAuto is the child and Automobile is the parent
{
	//Additional Attributes
	String noOfWheels;
	String fuelType;
	
	//creating constructor for ShareAuto
	ShareAuto()
	{
		System.out.println(">>ShareAuto object is contsructed");
	}
	
	//to redefine the same method from the parent to child with diff input 
	//we have 2 methods 1 from parent and 1 from child
	//both are diff as based in input (even though name is same)
	//method overloading(same method name with different inputs)
	void writeAutomobileDetails( String vechicleType, String name, int price,String noOfWheels, String fuelType) {
	
		this.vechicleType = vechicleType;
		this.name = name;
		this.price = price;
		this.noOfWheels=noOfWheels;
		this.fuelType=fuelType;
		System.out.println(">>Data written in the ShareAuto object");
	}
	
	
	//redefined the showAutomobileDetails method.
	//we hve same inputs
	//2 methods 1 from parent and 1 from child and we have same signature(same i/p's), but only child method will be executed .
	//Method overriding -same name with same input in parent child relationship
	
	void showAutomobileDetails() {
		System.out.println("------------AutomobileId:" + getvechicleId() + "--------------");
		System.out.println("Automobile Type:" + vechicleType);
		System.out.println("Automobile Name:" + name);
		System.out.println("Automobile Price:" + price);
		System.out.println("Automobile No of Wheels:" + noOfWheels);
		System.out.println("Automobile FuelType:" + fuelType);
		System.out.println();
	}
	public static void main(String[]args) {
		//requesting to get a ShareAuto object
		ShareAuto automobile2=new ShareAuto();
		//in this first Automobile object is created and ShareaUto object is constructed i.e parent object is get constructed before the child object =rule to inheritance (object to onject)
	    
		
		//automobile2.writeAutomobileDetails(4, "Three Wheeler", "Bajaj", 20000);
		//automobile2.showAutomobileDetails();
		
		//writing data in the shareAuto object
		automobile2.writeAutomobileDetails( "Passenger", "Bajaj", 20000, "3 Wheeler", "Gas");
		automobile2.setvechicleId(4);
		
		//reading data from the ShareAuto object
		automobile2.showAutomobileDetails();

	}
}


