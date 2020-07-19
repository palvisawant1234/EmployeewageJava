
public class Employeewage 
{
	public static final int PART_TIME=1;
	public static final int FULL_TIME=2;
	public static final int EMP_WAGE_PER_HR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=100;
    
	public static int computeEmpWage()
	{
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		int totalEmpWage=0;
		
		while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)
		{
			int empWage=0;
			totalWorkingDays++;
			int empCheck=(int) Math.floor(Math.random()*10)%3;
			switch(empCheck)
			{
				case PART_TIME:
					empHrs=4;
					break;
				case(FULL_TIME):
					empHrs=8;
					break;
				default:
					empHrs=0;
			}
			totalEmpHrs+=empHrs;
			empWage=empHrs*EMP_WAGE_PER_HR;
			System.out.println("Day:"+totalWorkingDays+"  Employee Hours:"+empHrs+"  Employee wage: "+empWage);
		}
		totalEmpWage=totalEmpHrs*EMP_WAGE_PER_HR;
		System.out.println();
		System.out.println("Total Employee Hours:"+totalEmpHrs+"	 Total Employee Wage:"+totalEmpWage);
		return totalEmpWage;
	}
	public static void main(String[] args)
	{
		computeEmpWage();
	}
}
