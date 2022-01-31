package school_management;

public class Student 
{
private int id;
private String name;
private int grade;
private int feespaid;
private  int feestotal;

Student(int id,String name,int grade)
{
	this.id=id;
	this.name=name;
	this.grade=grade;
	this.feespaid=0;
	this.feestotal=30000;
}

public void setgrade(int grade)
{
	this.grade=grade;
}

public void payfees(int fees)
{
	feespaid+=fees;
	School.updateTotalMoneyEarned(feespaid);
}

public int getid()
{
	return id;
}

public String getname()
{
	return name;
}

public int getgrade()
{
	return grade;
}

public int getfeespaid()
{
	return feespaid;
}

public int getremainingfees()
{
	return  feestotal=feespaid;
}
}
