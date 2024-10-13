package coding.DSA;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;



public class arrdublicate {
	
       
    public static void main (String[] args) {  
        int arr[] = {10,20,30,30,40,50,50};  
        int length = arr.length;  
        Set<Integer> s=new LinkedHashSet<Integer>();
        int k=0;
        
         for(int i=0;i<arr.length;i++) {
        	 Integer j=arr[i];
        	 if(!s.contains(j)) {
        		 s.add(j);
        		 k++;
        		 
        	 }
         }
         
         System.out.println(s);
         System.out.println("-----------------------------------------");
         
         System.out.println(k);
         Integer a[]=new Integer[k];
         Iterator<Integer> i= s.iterator();
         int j=0;
         while(i.hasNext()) {
        	 a[j]=i.next();
        	 j++;
         }
        	 
        for(int y=0;y<k;y++) {
        	System.out.println(a[y]);
        }
       
    }  
}  

