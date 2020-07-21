class Companyemployeewage 
{
	public static final int PART_TIME=1;
	public static final int FULL_TIME=2;
	
	private static String company;
	private static int fullDayHour;
	private static int EMP_WAGE_PER_HR;
	private static int MAX_HRS_IN_MONTH;
	private static int NUM_OF_WORKING_DAYS;
	
	Companyemployeewage(String company, int EMP_WAGE_PER_HR, int fullDayHour, int MAX_HRS_IN_MONTH, int NUM_OF_WORKING_DAYS)
	{
		this.company=company;
		this.EMP_WAGE_PER_HR = EMP_WAGE_PER_HR;
		this.fullDayHour = fullDayHour;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
		this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
	}
    
	public String getCompany() 
	{
		return this.company;
	}
	
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
		}
		totalEmpWage=totalEmpHrs*EMP_WAGE_PER_HR;
    		return totalEmpWage;
    	}
}

public class Employeewage 
{
	public static Companyemployeewage companyWage[] = new Companyemployeewage[3];

    	public static void main(String[] args)
	{
    		companyWage[0] = new Companyemployeewage("DMart", 20, 9, 110, 26);
		System.out.println(companyWage[0].getCompany()+" : "+companyWage[0].computeEmpWage());
		companyWage[1] = new Companyemployeewage("Reliance", 24, 8, 135, 20);
		System.out.println(companyWage[1].getCompany()+" : "+companyWage[1].computeEmpWage());
		companyWage[2] = new Companyemployeewage("Walmart", 20, 10, 120, 26);
		System.out.println(companyWage[2].getCompany()+" : "+companyWage[2].computeEmpWage());
	}
}
