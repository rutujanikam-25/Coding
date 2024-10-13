package coding.Basic;

public class factorial {

	public static void main(String[] args) {
		int n=5 ,count=1;
		for(int i=n;i>=1;i--) {
			System.out.print(i+" ");
			count=count*i;
			
		}
		System.out.println(count);

	}

}
