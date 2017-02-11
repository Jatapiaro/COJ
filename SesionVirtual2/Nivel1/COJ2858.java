import java.util.Scanner;
import java.math.BigInteger;
public class COJ2858{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String s = sc.nextLine();
			String onlyStrings = s.replaceAll("[^A-Za-z]","*");
			String onlyDigits = s.replaceAll("\\D","*");
			String[] theNumbers = onlyDigits.split("\\*");
			//System.out.println(onlyStrings+"\n"+onlyDigits);
			for(String str:theNumbers){
				System.out.println(str);
			}
		}
	}
}