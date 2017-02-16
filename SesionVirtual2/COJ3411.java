import java.util.Scanner;
import java.util.Locale;
public class COJ3411{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int casos = sc.nextInt();
		double rad45 = Math.toRadians(45);
		double rad90 = Math.toRadians(90);
		double pi = Math.acos(0)*2.0;
		for(int i = 0 ;i<casos;i++){

			double rad = sc.nextDouble();

			double cirArea = pi*rad*rad;
			double cuadar = 2*rad*rad;

			System.out.format(Locale.US,"%.2f%n",cirArea-cuadar);
		}
	}
} 