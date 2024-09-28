package coding.DSA;

public class QuickSort {
	
	public static int partition(int arr[],int low,int high) {
		
		int pivot=arr[high];
		int i=low-1;
		
		for(int j=low;j<high;j++) {
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
			arr[high]=temp;
			
		
		return i;
	}
	
	
	
	public static void quickSort(int arr[],int low,int high) {
		
		if(low<high) {
			int pivot=partition(arr,low,high);
			quickSort(arr,low,pivot-1);
			quickSort(arr,pivot+1,high);
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {2,1,3,5};
		int n=arr.length-1;
		 quickSort(arr,0,n);
		 
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }

	}

}
