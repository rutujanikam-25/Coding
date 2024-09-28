package coding.DSA;

public class OuickSort1 {
	public static int  partition(int arr[],int l,int h) {
		int pivot=arr[h];
		int i=l-1;
		for(int j=l;j<h;j++) {
			if(arr[j]<pivot) {
			i++;
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		}
		i++;
		
		int temp=arr[i];
		arr[i]=pivot;
		arr[h]=temp;
		
		return i;
		
		
		
	}
	
	public static void quick(int arr[],int l,int h) {
		if(l<h) {
			int pi=partition(arr,l,h);
			quick(arr,l,h-1);
			quick(arr,l+1,h);
		}
	}
	

	public static void main(String[] args) {
		int arr[]= {2,1,3,5,6};
		int n=arr.length-1;
		 quick(arr,0,n);
		 
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }

	}

}
