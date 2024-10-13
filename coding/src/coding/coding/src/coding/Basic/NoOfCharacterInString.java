package coding.Basic;

public class NoOfCharacterInString {

	 public static void main(String[] args) {
		String s="hello fjdnj jdhjdk";
		int vcount=0,count=0;
		/*for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
				System.out.print(s.charAt(i));
			}
		}
		System.out.println("\n"+count);*/
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
			if(s.charAt(i)=='a'||s.charAt(i)=='u'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='e') {
				vcount++;
			}else {
				count++;
			}
		}
	 }
		System.out.println(vcount+ "  "+count);
	}
}
