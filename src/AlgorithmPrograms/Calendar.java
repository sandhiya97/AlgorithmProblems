package AlgorithmPrograms;

public class Calendar {
    public static void main(String[] args) {
		
		UtilityDS util = new UtilityDS();
		System.out.println("Enter month and year");
		int month = util.inputInteger();
		int year = util.inputInteger();
		util.calender(month,year);
		
	}
}
