package coding.DSA;

public class fab {

	public static int cal(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		
		int fact=cal(n-1);
		int fact1=n*fact;
		return fact1;
	}
	
	public static void main(String[] args) {
		
		System.out.println(cal(5));

	}

}
