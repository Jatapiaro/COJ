import java.util.Scanner;
public class COJ3409{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int a = sc.nextInt();

			double r =a*.35;
			r*=.10;

			System.out.println((int)r);
		}
	}
}