package coding.Basic;

public class swap {

	public static void main(String[] args) {
		String s1="heo";
		String s2="ytf";
		int l=s1.length();
		s1=s1+s2;
		s2=s1.substring(0,l);
		s1=s1.substring(l,s1.length());
		System.out.println(s1+"   "+s2);

	}

}
