
import java.util.ArrayList;

public class LamdaAssignment4 {
	

	    public static void main(String[] args)
	    {
	        ArrayList<String> students = new ArrayList<String>();

	        students.add("Ramu");
	        students.add("Mohankrishna");
	        students.add("Shiva");
	        students.add("Ravi");
	        students.add("Sai");
	        students.removeIf(m -> (m.length() % 2 != 0));
	  
	        //System.out.println("Students name Does not start with S");
	        for (String str : students) {
	            System.out.println(str);
	        }
	        /*System.out.println("---------------------------------------------------------");
	        
	        ArrayList<Integer> students1 = new ArrayList<Integer>();

	        students1.add(32);
	        students1.add(56);
	        students1.add(67);
	        students1.add(43);
	        students1.add(87);
	        students1.removeIf(n -> (n %2!=0));
	        
	        System.out.println("Students name with odd lengths is removed");
	        for (int i: students1) {
	            System.out.println(i);
	        }*/
	    }
	    }
