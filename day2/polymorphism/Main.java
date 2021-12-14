// whenever an object have different different behaivour 
//according to the different different circumstances (change in behaviour) that is known as polymorphism.
//The behaivour of an object is known as Polymorphism.

// Advantages -- It reduces the complexcity of an object

// polymorphism -- poly means many, morphs means form;
// It is of two type static - compile time (achieved by method overloading)
// object is bound with a functionality at compile time is known as compile time polymorphism

//and Dynamic - runtime polymorphism (achieved by method overriding)...
// object is bound with their functionality at runtime is known as runtime polymorphism

// java does not support operator overloading explicitly.


// method overloading

class Main{
	static int add(int a, int b){
		return a+b;
	}
	static int add(int a, int b, int c){
		return a+b+c;
	}

	public static void main(String [] args){
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
	}

}


/*

		programmer side 				|						Java Side
----------------------------------------|-------------------------------------------
		println(10) 					|						println(int a)
----------------------------------------|-------------------------------------------
		println("Saloni")				|						println(String str)
----------------------------------------|-------------------------------------------
		println('S')					|						println(char ch)


*/

		// method overriding