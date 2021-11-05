package assignment6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.stream.Collectors;


public class LinkedListOfObject {

	public static void main(String[] args) throws ParseException {
	
		/*LinkedList<Date> date = new LinkedList<>();
		//Queue<Date> date = new LinkedList<Date>();
	
		//date.add(new Date(19960216));
		date.add(new Date());
		//date.add(new Date(19960216));
		System.out.println(date);*/
		
	
        
	         
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        LinkedList<Element> list = new LinkedList<>();
        list.add(new Element(dateFormat.parse("28.01.2016 08:43:00 ")));
        list.add(new Element(dateFormat.parse("28.01.2016 08:43:05 ")));
        list.add(new Element(dateFormat.parse("28.01.2016 08:44:00 ")));
        list.add(new Element(dateFormat.parse("28.01.2016 08:44:30 ")));
        list.add(new Element(dateFormat.parse("28.01.2016 08:44:35 ")));
        list.add(new Element(dateFormat.parse("28.01.2016 08:44:38 ")));
        list.add(new Element(dateFormat.parse("28.01.2016 08:45:00 ")));
        list.add(new Element(dateFormat.parse("28.01.2016 08:46:00 ")));

        Date leftLimit = dateFormat.parse("28.01.2016 08:44:00");
        Date rightLimit = dateFormat.parse("28.01.2016 08:45:00");

        System.out.println(list.stream().filter(element -> element.date.after(leftLimit) && element.date.before(rightLimit)).collect(Collectors.toList()));
    }

    static class Element {
        Date date;
        String someData;

        public Element() {
        }

        public Element(Date date) {
            this.date = date;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "Element{" +
                    "date=" + date +
                    '}';
        
    }
}
}