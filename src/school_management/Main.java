package school_management;

import java.util.ArrayList;

import java.util.List;

public class Main
{
public static void main(String[] args) 
{
	Teacher sonia=new Teacher(1,"sonia",500);
	Teacher sangee=new Teacher(2,"sangee",700);
	Teacher geetha=new Teacher(3,"geetha",600);
	
	List<Teacher>teacherList=new ArrayList<>();
	
	teacherList.add(sonia);
	teacherList.add(sangee);
	teacherList.add(geetha);
	
	Student raju=new Student(1,"raju",700);
	Student gopi=new Student(2,"gopi",800);
	Student vijay=new Student(3,"vijay",900);
	
	List<Student>studentList=new ArrayList<>();
	
	studentList.add(raju);
	studentList.add(gopi);
	studentList.add(vijay);
	
	School marcus=new School(teacherList,studentList);
	
	Teacher suja=new Teacher(6,"suja",900);
	
	marcus.addTeacher(suja);
	
	raju.payfees(5000);
	gopi.payfees(6000);
	
	System.out.println("marcus has earned:"+marcus.gettotalmoneyearned());
	
	System.out.println("making school pay salary:");
	
	sonia.receiveSalary(sonia.getSalary());
	
	System.out.println("marcus has spend salary to "+sonia.getname()+" and now has="+marcus.gettotalmoneyearned());
	
	System.out.println(gopi);
	
	sangee.receiveSalary(sangee.getSalary());
	
	System.out.println(sangee);
}
}
