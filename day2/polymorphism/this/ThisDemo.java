class ThisDemo{

	int x=10;
	void show(int x){
		System.out.println("show = "+this.x);
		System.out.println(x);
	}
	public static void main(String [] e){
		ThisDemo ob = new ThisDemo();
		ob.show(20);
	}
}