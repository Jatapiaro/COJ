import java.util.Scanner;
import java.util.Locale;
public class COJ3051{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int casos = sc.nextInt();
		for(int i = 0 ;i<casos;i++){
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			System.out.format(Locale.US,"%.2f%n",a/b);
		}
	}
} 