class example2{
	
	int x; // class level variable (by default) - 0
	String name; // class level variable (by default) - null
	
	void get(int x, String name){

		x = x; // 20 -- local variable
		name = name; // saloni  -- local variable

		// this.x = x; // class level variable -- 10
		// this.name = name; // class level variable -- Saloni
	}
	void show(){
		System.out.println(x); // printing class level variable
		System.out.println(name); // printing class level variable
	}
	public static void main(String [] args){
		example2 ob = new example2();
		ob.get(28, "Saloni");
		ob.show();
	}
}