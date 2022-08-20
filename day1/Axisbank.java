package week3.day1;

public class Axisbank extends Bankinfo{
	public void deposit() {
		System.out.println("Amount deposited in account:1000000");
	}
	public static void main(String[] args) {
		Bankinfo bi=new Bankinfo();
		bi.savings();
		bi.deposit();
		bi.Fixed();
		Axisbank ab=new Axisbank();
		ab.deposit();
	}
	
	}
	


