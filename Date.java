// Name: Joey Mills


public class Date{
	private int month;
	private int day;
	private int year;
	
	private static final int[] daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	//Constructor
	public Date(int month, int day, int year) {
		if (month < 0 || month > 12) { // check if month is in range 1-12
			throw new IllegalArgumentException("Month must be 1-12");
		}
		//check if day is in range for month
		if (day <= 0 || ( day > daysInMonth[month] && !(month == 2 && day == 29))) {
			throw new IllegalArgumentException("Day is out of bounds for specific month");
		}
		//leap year check if 2/29(month/day) is input
		if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 !=0))) {
			throw new IllegalArgumentException("year is not a leap year, day is out of bounds");
		}
		this.month = month;
		this.day = day;
		this.year = year;
	}
	//return month
	public int getMonth() {
		return month;
	}
	//return day
	public int getDay() {
		return day;
	}
	//return year
	public int getYear() {
		return year;
	}
	//return String format month/day/year
	public String toString() {
		return String.format("%d/%d/%d", getMonth(), getDay(), getYear());
	}
}