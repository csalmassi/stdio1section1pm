import support.cse131.ArgsProcessor;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int n0 = ap.nextInt("The first of two integers to be averaged?");
		int n1 = ap.nextInt("The second of two integers to be averaged?");
		double average = (n0 + n1)/2.0;
		System.out.println(average);
	}

}
