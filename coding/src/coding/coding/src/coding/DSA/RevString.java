package coding.DSA;

public class RevString {
    
	
	
	
	public static void main(String[] args) {
		String s="hello";
		 rev(s,s.length()-1);
	}

	public static void rev(String s, int i) {
		
		if(i==0) {
			System.out.print(s.charAt(i));
			return;
		}
		System.out.print(s.charAt(i));
		rev(s,i-1);
	}
}
