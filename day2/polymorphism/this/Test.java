// this keyword holds the refrence id of current object


class Test{
	// when class level variable and local variable name is same that concept is known as data-shadowing
	int x = 10; // class level variable
	//void show(int x){ // local variable -- (x = 20)
	void show(int x , Test z){ // Test is a class name -- pasing reference id of ob in z as scope of method is local.
		
		// passing reference can be complex in huge of large program can be typical, so this keyword come in consideration.

		System.out.println(z.x); // 10 -- class level variable  
		System.out.println(x); // 20
	}
	public static void main(String [] args){
		Test ob = new Test(); // object ob
		
		System.out.println(ob.x); // ob.x = 10 inside main method
		
		// to print the x (class level) from show method we need to pass the object or give reference id 
		
		// ob.show(20); 
		ob.show(20 , ob); // ob - reference id - is passed in show method

	}
}

