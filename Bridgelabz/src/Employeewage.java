
public class Employeewage 
{
		public static void main(String[] args)
		{
			int EMP_WAGE_PER_HR=20;
			int NUM_OF_WORKING_DAYS=20;
			int MAX_HRS_IN_MONTH=100;
			int empHrs=0;
			int totalEmpWage=0;
			int totalEmpHrs=0;
			int totalWorkingDays=0;
			while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)
			{
				int empWage=0;
				totalWorkingDays++;
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
				totalEmpHrs+=empHrs;
				empWage=empHrs*EMP_WAGE_PER_HR;
				System.out.println("Day:"+totalWorkingDays+"  EmployeeHours:"+empHrs+"  Employee wage: "+empWage);
			}
			totalEmpWage=totalEmpHrs*EMP_WAGE_PER_HR;
			System.out.println("Total Employee Wage:"+totalEmpWage);
		}
}