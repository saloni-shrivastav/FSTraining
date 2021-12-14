class Test{

	//
 
	String name;
	int salary;

	void get(String n, int s){

		// paprameterised method - get : parameters: n and s

		name = n;
		salary = s;
	}
	void show(){

		// print the name and salary

		System.out.println(name);
		System.out.println(salary);
	}

	public static void main (String args[]){

		// Execution of program starts from here..


		Test obj = new Test(); 
		// Test : ClassName , obj: name of the object , new - operator: allocates the memory (keyword)
		// Internal working : memory management

		obj.get("Saloni", 70000);
		obj.show();


		Test obj2 = new Test();
		obj.get("Sonali", 70000);
		obj.show();
	}
}


//Memory Management:: Representation


