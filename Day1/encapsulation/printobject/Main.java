class Main{
	public static void main(String [] args){
		Main ob = new Main();
		System.out.println(ob); // doesnot print the reference of object, 
		// jvm will print a string == combination of (className,@,hexaDecimalNumber) 
	}
}