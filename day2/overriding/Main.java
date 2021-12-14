class Base
{
	show()
	{
		System.out.println("base");
		return new Base(); // parent class object is return
	}
}
// function with different return type - different is only possible with non - primitive data type
// we cannot override function with different return type (primitive) value
class child extends Base
{
	show()
	{
		System.out.println("child");
		return new child(); // return the child class object
	}
}
class Main{
	public static void main(String[] args) {
	child c1=new child();
	c1.show();
	}
}