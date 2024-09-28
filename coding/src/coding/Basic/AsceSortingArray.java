package coding.Basic;

import java.util.Arrays;

public class AsceSortingArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,6,2,34,100};
		int temp;
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

		int total=a.length;
		
		System.out.println(a[1]);
		
			}

}
