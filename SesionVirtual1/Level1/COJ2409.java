import java.util.Scanner;


public class COJ2409{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String name = sc.nextLine();
			long a = sc.nextLong();
			long b = sc.nextLong();
			System.out.println(name+" "+Math.abs(a-b));
		
			
		}
	}
}