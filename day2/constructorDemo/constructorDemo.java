class constructorDemo{
	//this is the implicit return type of constructor
	// this keyword hold the reference-id of object

	int x;
	int y;

	constructorDemo(){ // non perimeterized constructor 
		// constructor has no return type
		// class name and method name can be same 
		// there are two types of constructor:: perimeterized and non-perimeterized 
	
		x = 10; // initialize the value of x (class level variable)
		y = 20; // initialize the value of y (class level variable)

	}

// if we want to initialize the value with same data then we use non-perimeterized constructor
// if we want to intialize the values with differnt data then we use perimeterized constructor

	constructorDemo(int x , int y){ // perimeterized constructor
		
		this.x = x;
		this.y = y;
	}

	void show(){
		System.out.println(x);
		System.out.println(y);
	}
	public static void main (String [] args){
		constructorDemo cd = new constructorDemo();
		constructorDemo cd2 = new constructorDemo(100 , 200);
		cd.show();
		cd2.show();
	}
}