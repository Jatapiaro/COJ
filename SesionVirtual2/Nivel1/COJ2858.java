import java.util.Scanner;
import java.math.BigInteger;
public class COJ2858{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger mod = new BigInteger("1000000007");
		/*String a = "0101011101010101";
		String l = "347923498234";
		System.out.println(a.matches("[01]+")+" - "+l.matches("[01]+"));*/
		while(sc.hasNext()){
			String s = sc.nextLine();
			String onlyStrings = s.replaceAll("[^A-Za-z]","*");
			String onlyDigits = s.replaceAll("\\D"," ");
			String[] theNumbers = onlyDigits.replaceAll("[ ]+", " ").trim().split("\\s");
			String onlyLetters = onlyStrings.replaceAll("[*]+", "*");
			//System.out.println(onlyLetters);
			for(String str:theNumbers){
				if(str.matches("[01]+")){
					BigInteger b = new BigInteger(str,2);
					BigInteger r = b.mod(mod);
					//System.out.println(r);
					onlyLetters = onlyLetters.replaceFirst("\\*",r.toString());
				}else{
					onlyLetters = onlyLetters.replaceFirst("\\*",str);
				}
			}
			System.out.println(onlyLetters);
		}
	}
}