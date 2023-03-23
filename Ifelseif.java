package basic;

public class Ifelseif {
	public static void main(String args[]) {
		int n=40;
		if (n<35) {
			System.out.println("student is fail");
		}
		else if((n>=35)&&(n<50)){
			System.out.println("student is pass and got 2nd class");
		}
		else if ((n>=50)&&(n<70)) {
			System.out.println("student is pass and got 1st class");
		}
		else {
			System.out.println("student is pass and got distinction");
		}
	}

}
