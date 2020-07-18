
public class Employeewage 
{
		public static void main(String[] args)
		{
			int EMP_WAGE_PER_HR=20;
			int NUM_OF_WORKING_DAYS=20;
			int empHrs=0;
			int empWage=0;
			int totalEmpWage=0;
			System.out.println("Welcome to Employee Wage Computation");
			for(int day=1;day<=NUM_OF_WORKING_DAYS;day++)
			{
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
			totalEmpWage+=empWage;
			System.out.println("Day "+day+" Employee Wage:"+empWage);
			}
			System.out.println("Total Employee Wage:"+totalEmpWage);
		}
}