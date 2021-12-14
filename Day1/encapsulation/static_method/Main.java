class Main{
	
	static int add(int a, int b){
		// not working for any object
		// to make / manage memory effiecient

		return a+b;
	}
	public static void main(String [] args){
		// Main ob = new Main(); // object of Main class not required and HEAP memory is saved
		int res = add(10,20);
		System.out.println("sum is: " +res); // 30
	}
}