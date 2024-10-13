package coding.DSA;

public class Insertion {

	public static void main(String[] args) {
		int a[]= {8,6,4,3};
		for(int i=0;i<a.length;i++) {
			int currnt=a[i];
			int j=i-1;
			while(j>=0 && currnt<a[j]) {
				a[j+1]=a[j];
				j--;
				
			}
			a[j+1]=currnt;
			
		}

		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
