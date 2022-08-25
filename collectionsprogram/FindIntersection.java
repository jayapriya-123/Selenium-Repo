package collectionsprogram;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int [] a= {3,2,11,4,6,7};
		int [] b= {1,2,8,4,9,7};
	
		List<Integer> list1=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
	
		for(int i=0;i<a.length;i++) {
			list1.add(a[i]);
		}
			for(int j=0;j<b.length;j++) {
				list2.add(b[j]);
				}
	
			System.out.println(list1);
			System.out.println(list2);


			

			//int size=list1.size();
			//int size1=list2.size();
		
			for(int k=0;k<list1.size();k++) {
				for(int l=0;l<list2.size();l++) {
					if(list1.get(k)==list2.get(l)) {
						System.out.println(list1.get(k));
					}
					}
				}
	}
}
			
				
			
				


