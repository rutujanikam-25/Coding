package coding.Basic;

public class LeftRatationArray {

	public static void main(String[] args) {
		int [] a= {10,20,30,40,50};
		
		System.out.println("origimnal array");
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		
		int n=3;
		for(int i=0;i<n;i++) {
			int first,j;
			first=a[0];
			for( j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[j]=first;
			
		}
		
		System.out.println("left rotation");
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		

	}

}
