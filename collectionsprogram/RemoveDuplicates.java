package collectionsprogram;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String str="PayPal India";
		char[] ch=str.toCharArray();
		Set<Character>Charset=new HashSet<Character>();
		Set<Character>dupcharset=new HashSet<Character>();
		for(int i=0;i<ch.length;i++) {
			if(Charset.contains(ch[i])) {
				dupcharset.add(ch[i]);
			}
			Charset.add(ch[i]);
		}
				System.out.println(Charset);
				System.out.println(dupcharset);
				
			}
				
			
		}
			
		
	


