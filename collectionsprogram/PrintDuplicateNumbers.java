package collectionsprogram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateNumbers {
	public static void main(String[] args) {
		int[] data= {4,3,6,8,29,1,2,4,7,8};
		//Arrays.sort(data);
		
		Set<Integer> num=new HashSet<Integer>();
		for(int i=0;i<data.length;i++) {
			num.add(data[i]);
		}
			System.out.println(num);
			
	}

}
