import java.util.*;
public class COJ2789{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {

			PriorityQueue<Integer> pQueue =
                          new PriorityQueue<Integer>();
			String[] s = sc.nextLine().split("\\+");

			for ( String n : s ) {
				pQueue.add(Integer.parseInt(n));
			}

			StringBuilder sb = new StringBuilder();

			while ( !pQueue.isEmpty() ) {
				if (pQueue.size() == 1) {
					sb.append(pQueue.remove());
				} else {
					sb.append(pQueue.remove() + "+");
				}
			}

			System.out.println(sb.toString());

		}
	}
}