package collectionsprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.util.SystemOutLogger;

public class FindSecondLargest {
	public static void main(String[] args) {
		int [] data= {3,2,11,4,6,7,2,3,3,6,7};
		/*int max=0;
		int secmax=0;
		
		for(int i=0;i<data.length;i++)
		{
			if(data[i]>max)
			{
				secmax=max;
				max=data[i]; 
			}
			else if(data[i]>secmax)
			{
				secmax=data[i];
			}
		}
		System.out.println("Second largest number: "+ secmax);*/
	
		
	Set<Integer>set=new TreeSet<Integer>();
	/*set.add(3);
	set.add(2);
	set.add(11);
	set.add(4);
	set.add(6);
	set.add(7);
	set.add(2);
	set.add(3);
	set.add(3);
	set.add(6);
	set.add(7);*/
	for(int i=0;i<data.length;i++) {
		set.add(data[i]);
	}
	for(Integer num1:set)
	{
		System.out.println(num1);
	}
	List<Integer>num2=new ArrayList<Integer>(set);
	System.out.println(num2);
	num2.get(4);
	System.out.println("Second max number in list :" +num2.get(4));
	
}
		
}
