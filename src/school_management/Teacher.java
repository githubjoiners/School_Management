package school_management;

public class Teacher 
{
private int id;
private String name;
private int Salary;
private int Salaryearned;

Teacher(int id,String name,int Salary)
{
	this.id=id;
	this.name=name;
	this.Salary=Salary;
	this.Salaryearned=0;
}

public int getid()
{
	return id;
}

public String getname()
{
	return name;
}

public int getSalary()
{
	return Salary;
}

public void receiveSalary(int i)
{
	Salaryearned+=Salary;
	School.updateTotalMoneyEarnedd(Salary);
}
}
