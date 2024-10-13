package coding.Basic;

public class ArrayMAxValue {

	public static void main(String[] args) {
		int a[]= {10,20,48,0,12,43,87};
		int max=a[0];
		
		for(int i=1;i<=a.length-1;i++) {
			if(max>a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
