package assignment6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class CollectionLeapYearAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date("01/01/1999");
		Date date1 = new Date("12/02/2010");
		Date date2 = new Date("13/03/2011");
		Date date3 = new Date("10/10/2012");
		Date date4 = new Date("15/10/2013");
		Date date5= new Date("16/10/2004");
		Date date6 = new Date("10/10/2005");
		
		List<Date> dobList = new LinkedList<>();
		dobList.add(date);
		dobList.add(date1);
		dobList.add(date2);
		dobList.add(date3);
		dobList.add(date4);
		dobList.add(date5);
		dobList.add(date6);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		for(int i =0;i<dobList.size();i++) {
			LocalDate ld =LocalDate.parse(dobList.get(i).date,df);
			String sd = (ld).format(df);
			
			if (ld.getYear()%4 ==0) {
				System.out.println(sd + "This is a leap year");
			}
			else{
				System.out.println(sd+"This is not a leap year");
			}
			
		}
		}
}

class Date {
	String date;

	public Date(String date) {
		super();
		this.date = date;
	}
	
	

	@Override
	public String toString() {
		return " [date=" + date + "]";
	}



	public String getDate() {
		return date;
	}

	
}