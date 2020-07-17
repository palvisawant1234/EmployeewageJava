
public class Employeewage 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Employee Wage Computation");
		int Attendance=1;
		int EMP_WAGE_PER_HR=20;
		int empHrs=0;
		int empWage=0;
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==Attendance)
		{
			System.out.println("Employee is Present.");
			empHrs=8;
		}
		else
		{
			System.out.println("Employee is Absent.");
			empHrs=0;
		}
		empWage=empHrs*EMP_WAGE_PER_HR;
		System.out.println("Daily Employee Wage:"+empWage);
	}
}
