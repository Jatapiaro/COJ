import java.util.Scanner;
import java.util.Locale;
///no aceptado aún
public class COJ3408{
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int casos = sc.nextInt();

		String maxID = "";
		double max = -1;

		sc.next();

		for(int i=0;i<casos;i++){
			String[] s = sc.nextLine().split("\\s");
			String id = s[0];
			double x1 = Integer.parseInt(s[1]);
			double y1 = Integer.parseInt(s[2]);
			double x2 = Integer.parseInt(s[3]);
			double y2 = Integer.parseInt(s[4]);
			double x3 = Integer.parseInt(s[5]);
			double y3 = Integer.parseInt(s[6]);

			double p1 = x1*(y2-y3);
			double p2 = x2*(y1-y3);
			double p3 = x3*(y1-y2);

			double tot = Math.abs((p1-p2+p3)/2);
			if(tot>max){
				maxID = id;
				max = tot;
			}
		}
		System.out.format(Locale.US,"%s %.2f km^2%n",maxID,max);
	}
} 
