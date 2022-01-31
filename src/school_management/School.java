package school_management;

import java.util.List;

public class School
{

	private List<Teacher>teachers;
	private List<Student>students;
	private static int TotalMoneyEarned;
	private static int TotalMoneySpent;
	
	
	School(List<Teacher> teachers,List<Student> students)
	{
		this.teachers=teachers;
		this.students=students;
		TotalMoneyEarned=0;
		TotalMoneySpent=0;
	}
	public List<Teacher>getTeachers()
	{
		return teachers;
	}
	
	public void addTeacher(Teacher teacher)
	{
		teachers.add(teacher);
	}
	
	public List<Student>getStudents()
	{
		return students;
	}
	
	public void addStudent(Student student)
	{
		students.add(student);
	}

	public int gettotalmoneyearned()
	{
		return TotalMoneyEarned;
	}
	
	public static void updateTotalMoneyEarned(int MoneyEarned)
	{
		TotalMoneyEarned+=MoneyEarned;
	}
	
	public int gettotalmoneyspent()
	{
		return TotalMoneySpent;
	}
	
	public static void updateTotalMoneyEarnedd(int MoneySpent)
	{
		TotalMoneyEarned-=MoneySpent;
	}
}
