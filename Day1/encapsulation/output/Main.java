class Main{
	String name;
	public static void main (String [] args){
		Main ob = new Main();
		System.out.println(ob);
		ob.name = "Lalu";
		System.out.println(ob.name);
		Main ob2 = ob;
		System.out.println(ob2.name);
		ob2.name = "Bhalu";
		System.out.println(ob.name);
		System.out.println(ob2.name);
	}
}