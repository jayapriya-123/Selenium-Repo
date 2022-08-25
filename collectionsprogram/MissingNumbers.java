package collectionsprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumbers {
	public static void main(String [] args) {
		int a[] = {1,2,3,4,5,7,8,9,10};
		Arrays.sort(a);
		
	Set<Integer>set=new TreeSet<Integer>();
	for (int i = 0; i < a.length; i++) {
		set.add(a[i]);
	}

	//System.out.println(set);
		List<Integer> list = new  ArrayList<Integer>(set);
		
	
		for (int i = 1; i < list.size(); i++) {
			if (i!=list.get(i-1)) {
				System.out.println(i);
				break;
			}
		}
		
			
		}
	}
	
		
		
	


