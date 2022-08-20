package week3.day1;

public class Students {
	public static void main(String[] args) {
		Students stud1=new Students();
		stud1.getstudentinfo(123);
		stud1.getstudentinfo(123,"priya");
		stud1.getstudentinfo("pri@gmail.com",960036);
		}
	public void getstudentinfo(int studentid) {
		System.out.println(studentid);
	}
	public void getstudentinfo(int studentid,String studentname) {
		System.out.println(studentid+studentname);
	}
	public void getstudentinfo(String email,int phoneno) {
		System.out.println(email+phoneno);
	}
		
	}


