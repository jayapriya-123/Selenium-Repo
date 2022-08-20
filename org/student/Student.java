package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department{
	public void Studentname() {
		System.out.println("Jayaprasath");
	}
	public void Studentdept() {
		System.out.println("Mechanical department");
	}
	public void Studentid() {
		System.out.println("6789");
	}
	public static void main(String[] args) {
		College cn=new College();
		cn.CollegeName();
		cn.CollegeCode();
		cn.CollegeRank();
		Department dept= new Department();
		dept.Departmentname();
		Student stud=new Student();
		stud.Studentname();
		stud.Studentdept();
		stud.Studentid();
		
		
		
	}

}
