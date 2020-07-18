
public class Employeewage 
{
		public static void main(String[] args)
		{
			int EMP_WAGE_PER_HR=20;
			int empHrs=0;
			int empWage=0;
			System.out.println("Welcome to Employee Wage Computation");
			int empCheck=(int) Math.floor(Math.random()*10)%3;
			switch(empCheck)
			{
			case 1:
				empHrs=4;
				break;
			case 2:
				empHrs=8;
				break;
			default:
				empHrs=0;
			}
			empWage=empHrs*EMP_WAGE_PER_HR;
			System.out.println("Todays Employee Wage:"+empWage);
		}
}