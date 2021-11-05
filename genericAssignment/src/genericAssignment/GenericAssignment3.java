package genericAssignment;

public class GenericAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer arr []= {10,20};
		
		System.out.println("Before Exchange:" + arr[0]+" "+ arr[1]);
		System.out.println("After Exchange:");
		exchangeArrNum(arr);
		

	}
	public static <E> void exchangeArrNum(E[] arr) {
		E temp = arr [1];
		arr[1]= arr[0];
		arr[0]=  temp;
		//arr[0] = arr[1];
		
		System.out.println( arr[0]+" "+ arr[1]);
		
	}

}
