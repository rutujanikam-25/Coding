package coding.Basic;

public class RightRotation {

	public static void main(String[] args) {
		int [] a= {10,20,30,40,50};
		
		System.out.println("original array");
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		
		int n=3;
		
		for(int i=0;i<n;i++) {
			int j ,last;
			
			last=a[a.length-1];
			
			for(j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
			}
			
			a[0]=last;
			
		}
		
		System.out.println("roted array");
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}

	}

}
