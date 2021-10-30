package assignment2;

public class Persistance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilePersistance fp = new FilePersistance();
		DataBasePersistance dp = new DataBasePersistance();
		fp.persist();
		dp.persist();
		
		

	}
}
    abstract class Persistance {
	public abstract void persist();
}
    class FilePersistance extends Persistance {
	public void persist() {
		System.out.println("This file will saved FilePersistance");
		// TODO Auto-generated method stub
		
	}
}
    class DataBasePersistance extends Persistance {
	public void persist() {
		System.out.println("This file will saved DataBasePersistance");

		// TODO Auto-generated method stub
		
	}
	
}
