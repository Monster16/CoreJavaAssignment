package java11assignment1;

public class Java11_Assignment1 {
	public static void main(String[] args) {
		var P=10000;
		var R=6;
		var T=3;
		CalculateSI obj = (var a,var b,var c) -> (a*b*c)/100;
		System.out.println(obj.sI(P, R, T));
	}

}

interface CalculateSI{
	double sI(double P,double R,double T);
}


