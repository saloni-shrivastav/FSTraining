// method overloading is used to achieve compile time polymorphism
// here the methods have (same name i.e) one method doing multiple task
// METHOD OVERLOADING

// access modifier , return type does not affect the flow of program


class Main{
	static int add(int a, int b){
		// add is a method which has two parameter
		return a+b;
	}
	static int add(int a, int b, int c){
		// add is a method which has three parameter
		return a+b+c;
	}
	// add is a same method that has different behaviour
	public static void main(String [] args){
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
	}

}