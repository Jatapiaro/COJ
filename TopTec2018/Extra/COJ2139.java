import java.util.*;
public class COJ2139 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(sc.hasNext()) {
			String[] check = sc.nextLine().split("\\s");
			char[] target = check[0].toCharArray();
			char[] remove = check[1].toCharArray();
			List<Character> l = new ArrayList<Character>();
			for(char r : target) {
				l.add(r);
			}

			for (char r : remove) {
				if ( r == l.get(0) ) {
					l.remove(0);
				}
				if (l.size() == 0) {
					break;
				}
			}

			if ( l.size() == 0 ) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}
	}
}