import java.util.*;
public class COJ1177 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<String> strs = new ArrayList<String>();

		while(sc.hasNext()) {
			String[] get = sc.nextLine().split("\\s+");
			if ( get.length == 1){
				break;
			} else {
				int n = Integer.parseInt(get[0]);
				String s = get[1];
				System.out.println(reverseAndAppend(s, n));
			}

		}

		/*for( int i = 0; i<strs.size(); i++ ){
			System.out.println(strs.get(i));
		}*/
	}

	public static String reverseAndAppend( String s, int n ) {

		n = s.length() / n;
		String regex = "(?<=\\G.{"+n+"})";
		String[] subs = s.split(regex);

		StringBuilder sb = new StringBuilder();

		for ( String st : subs ) {
			StringBuilder sax = new StringBuilder(st);
			sax.reverse();
			sb.append(sax);
		}

		return sb.toString();

	}
}