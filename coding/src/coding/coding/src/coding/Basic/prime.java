package coding.Basic;

public class prime {
  public static void main(String[] args) {
	int  n=12,count=0;
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
		count++;
		}
		
		if(count==2) {
			System.out.println(i);
		}
		
	}
	if(count==2) {
		System.out.println("is prime");
	}else {
		System.out.println("not prime");
	}
  }	

	
}
