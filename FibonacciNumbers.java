package week1.day2;

public class FibonacciNumbers {
	public static void main(String[] args) {
		int firstnum=0,secnum=1,sum=0;
		System.out.println(firstnum);
		System.out.println(secnum);
		for(int i=0;i<21;i++) {
			System.out.println(sum);
			if(sum==21) {
				break;
			}
			sum=firstnum+secnum;
			firstnum=secnum;
			secnum=sum;
	
		}
		
	}

}
