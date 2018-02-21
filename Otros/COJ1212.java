import java.util.*;
public class COJ1212 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			String s = sc.nextLine();
			if ( s.equals("*") ) {
				break;
			} else {
				System.out.println(howMuch(s));
			}
		}
	}

	public static int howMuch ( String s ) {

		s = s.replaceFirst("/", "");
		String[] slices = s.split("/");
		int count = 0;
		for ( String slice : slices ) {
			char sliceChars[] = slice.toCharArray();
			double count2 = 0;
			for ( char c : sliceChars ) {
				count2+=getValueOfSymbol(c);
			}
			if ( count2 == 1 ) {
				count++;
			}
		}
		return count;
	}

	public static double getValueOfSymbol(char c) {

		switch (c) {

			case 'W': 
				return 1;


			case 'H':
				return 0.5;


			case 'Q':
				return 0.25;


			case 'E': 
				return 0.125;


			case 'S':
				return 0.0625;


			case 'T':
				return 0.03125;

			case 'X':
				return 0.015625;

			
		}

		return -1;

	}
}