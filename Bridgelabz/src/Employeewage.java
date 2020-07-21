public class Employeewage 
{
	public static final int PART_TIME=1;
	public static final int FULL_TIME=2;
	
    	private static String company;
	private static int fullDayHour;
	private static int EMP_WAGE_PER_HR;
	private static int MAX_HRS_IN_MONTH;
	private static int NUM_OF_WORKING_DAYS;
	
	Employeewage(String company, int EMP_WAGE_PER_HR, int fullDayHour, int MAX_HRS_IN_MONTH, int NUM_OF_WORKING_DAYS)
	{
		this.company=company;
		this.EMP_WAGE_PER_HR = EMP_WAGE_PER_HR;
		this.fullDayHour = fullDayHour;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
		this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
	}
    
    	public static int computeEmpWage()
	{
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		int totalEmpWage=0;
		System.out.println("Company name : "+company);
		
		while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)
		{
			int empWage=0;
			totalWorkingDays++;
			int empCheck=(int) Math.floor(Math.random()*10)%3;
			switch(empCheck)
			{
				case PART_TIME:
					empHrs=fullDayHour/2;
					break;
				case FULL_TIME:
					empHrs=fullDayHour;
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
		System.out.println();
		return totalEmpWage;
	}
	
    	public static void main(String[] args)
	{
		Employeewage company1 = new Employeewage("DMart", 20, 10, 95, 25);
		company1.computeEmpWage();
		Employeewage company2 = new Employeewage("Reliance", 24, 8, 120, 30);
		company2.computeEmpWage();
		Employeewage company3 = new Employeewage("Big Bazaar", 18, 9, 120, 26);
		company3.computeEmpWage();
	}
}
