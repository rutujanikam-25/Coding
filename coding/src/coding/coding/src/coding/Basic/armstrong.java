package coding.Basic;

public class armstrong {
	
	public static boolean arm(int n) {
		int arm=0;
		 while(n>0) {
			   int rem=n%10;
			   arm=arm+(rem*rem*rem);
			   n=n/10;
		   }
		   if(n==arm) {
			   return true;
		   }
		   return false;
	}
	
   public static void main(String[] args) {
	   
	   for(int i=1;i<=153;i++) {
		   if(arm(i)) {
			   System.out.print(i+ " ");
		   }
	   }
   }
}
