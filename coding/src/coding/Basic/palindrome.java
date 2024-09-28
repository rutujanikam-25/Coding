package coding.Basic;

public class palindrome {
   public static void main(String[] args) {
	   int n=122,rev=0;int temp=n;
	   while(n>0) {
		   int rem=n%10;
		   rev=rem+(rev*10);
		   n=n/10;
	   }
	   
	   if(rev==temp) {
		System.out.println("palindrome");  
	   }else {
		   System.out.println("Not palindrome");
	   }
   }
}
