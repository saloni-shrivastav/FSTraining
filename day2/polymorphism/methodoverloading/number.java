class number{
	void show(byte b){
		System.out.println("byte = "+b);
	}
	void show(short s){
		System.out.println("short = "+s);
	}
	void show(int i){
		System.out.println("int = "+i);
	}
	void show(long l){
		System.out.println("Long = "+l);
	}

	public static void main(String [] args){
		number n = new number();
		n.show(10);// by default any number is a integer if there is no decimal
		n.show(10l); // l is a sufix for puting value in long.

		// byte and short does not have any sufix
		// for passing these value as parameter we need to define them using datatype.

		byte b = 120;
		short s = 12;
		n.show(b);
		n.show(s);
	}
}