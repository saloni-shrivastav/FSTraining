// inheritance is just a process to achieve reuseablity among the objects
// to achieve dynamic binding - without inheritance we cannot achieve dynamic binding


// java doesnot support multiple inheritance -- it can be achieved by interface 
// but we cannot create object of interface whereas the class object is possible.
// 

class Base{
	
	// parent class 

	int x = 50; // data member 

}
// Same data member in parent class and same data member in child class is known as data hiding

class child extends Base{ // child class
	
	int x = 20;
	
	void show(){
		
		System.out.println(x); // x = 20 (child class)
		System.out.println(super.x); // super keyword is used to excess the parent class -- x = 50
	}

	public static void main(String [] args){
		
		child c = new child();
		c.show();
	
	}

}