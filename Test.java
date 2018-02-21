import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int w = Integer.parseInt(sc.nextLine());

		StringBuilder sb = new StringBuilder();

		String[] words = new String[w];

		for ( int i = 0; i < w; i++ ) {
			words[i] = sc.nextLine();
		}

		System.out.println(getFinalWord(words));

	}

	public static String getFinalWord( String[] arr ) {
		StringBuilder sb = new StringBuilder(arr[0].trim());
		for ( int i = 1; i < arr.length; i++ ) {
			sb = getNewSb(sb, arr[i].trim());
		}
		return sb.toString();
	}

	public static StringBuilder getNewSb( StringBuilder sb, String s ) {
		String s2 = sb.toString();
		char[] cs = s.toCharArray();
		int i = 0;
		String app = "";
		String lasAccepted = "";
		for ( char c : cs ) {
			app += c;
			if ( s2.endsWith(app) ) {
				lasAccepted = app+"";
				i++;
			}
		}
		return sb.append(s.replace(lasAccepted, ""));
	}

}