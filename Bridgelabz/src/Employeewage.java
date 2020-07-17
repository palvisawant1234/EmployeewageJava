
public class Employeewage 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Employee Wage Computation");
		int Attendance=1;
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==Attendance)
			System.out.println("Employee is Present.");
		else
			System.out.println("Employee is Absent.");
	}
}
