package collectionsprogram;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	public static void main(String [] args) {
		String name="Jayapriya";
		char [] chars=name.toCharArray();
		Set<Character>set=new HashSet <Character>();
		for(Character name1 : chars) {
			set.add(name1);
		}
		System.out.println(set);
		
	}

}
