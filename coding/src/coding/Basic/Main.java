package coding.Basic;

public class Main {
    public static void main(String[] args) {
        String str = "hello world hii";
        char[] chars = str.toCharArray();

        String[] s = new String[3];
        int k= 0;
        String word = "";

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                word += chars[i];
            } else {
                s[k] = word; 
                k++;
                word = ""; 
            }
        }
        
        
        s[k] = word;

        
        for (int i=s.length-1;i>=0;i--) {
            System.out.print(s[i]+" ");
        }
    }
}

