package coding.Basic;

class p{
	private int x=10;
	public void display() {
		System.out.println("parent");
	}
}
class C extends p{
	
	
	  public void display() { System.out.println("child"); }
	 
}




public class A {

	public static void main(String[] args) {
		p a=new C();
		a.display();

	}

}
