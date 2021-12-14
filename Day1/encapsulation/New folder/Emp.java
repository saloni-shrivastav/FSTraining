class Emp{

	static String c_name = "TCS";
	// c_name is a static variable because it is common for all employies 
	// static variable is sotred in C.I.A (class information area) in memory area and it is a part of method area.
	// multithreading, collection framework --- important - interview point of view
	String name;
	int salary;
		void set(String s1, int s2){//(String s3) is already defined c_name = "TCS"
			name = s1;
			salary = s2;
			// c_name = s3;
		}
	
		void show(){
			System.out.println(c_name);
			System.out.println(name);
			System.out.println(salary);
		}
	
		public static void main(String [] args){
			Emp e1 = new Emp();
			Emp e2 = new Emp();
			e1.set("Lalu", 50000);//we dont pass TCS as third parameter..
			// . is assossiate operator

			e2.set("Rabri", 60000);

			e1.show();
			e2.show();
		}
}