import support.cse131.ArgsProcessor;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int n0 = ap.nextInt("Is this year a leap year?");
		boolean leapYear = (n0 % 4 == 0) && (n0 % 100 != 0) || (n0 % 400) == 0;
		System.out.println(leapYear);
	}
}
