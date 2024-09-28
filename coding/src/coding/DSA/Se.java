package coding.DSA;

public class Se {
   public static void main(String[] args) {
	   int arr[]= {3,5,8,1};
	   for(int i=0;i<arr.length;i++) {
		   int small=i;
		   for(int j=i+1;j<arr.length;j++) {
			   if(arr[small]>arr[j]) {
				   small=j;
			   }
		   }
		   int temp=arr[small];
		   arr[small]=arr[i];
		   arr[i]=temp;
	   }
	   
	   for(int i=0;i<arr.length;i++) {
		   System.out.println(arr[i]);
	   }
}
   
}
