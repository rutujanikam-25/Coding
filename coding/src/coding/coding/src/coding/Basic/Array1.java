package coding.Basic;

import java.net.MulticastSocket;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Array1 {
	public static void main(String[] args) {
		String s="aabbccgcjdd";
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			Character c=s.charAt(i);
			map.put(c, map.containsKey(c)?map.get(c)+1:1);
		}
		
		/*Set<Entry<Character,Integer>> set=map.entrySet();
		for(Entry e:set) {
			System.out.println(e.getKey()+" "+e.getValue());
			
			if(e.getValue()==1) {
				
			}
		}*/
		
		for(Entry<Character,Integer> e:map.entrySet()) {
			System.out.print(e.getKey()+""+e.getValue());
			
		}
		
	}
}
