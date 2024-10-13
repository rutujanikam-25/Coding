package coding.DSA;

public class BinarySearch {

	public static int binary(int arr[],int key) {
		int l=0,h=arr.length,mid=0;
		
		while(l<h) {
			
			mid=(l+h)/2;
			if(key==arr[mid]) {
				return mid;
			}else if(key<arr[mid]){
				h=mid-1;
				}else {
					l=mid+1;
				}}
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8};
		int n=9;
		System.out.println(binary(arr,n));
	}
}
