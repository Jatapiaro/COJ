import java.util.*;
public class COJ3772 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		for ( int j = 0; j<n; j++) {
			String[] numbers = sc.nextLine().split("\\s");
			double tot = 0;
			for ( String ni : numbers ) {
				double a = Double.parseDouble(ni);
				a *= 0.85;
				tot+=a;
			}
			System.out.format(Locale.US,"%.3f%n",tot);
		}

	}

}