import java.util.*;
public class COJ1318 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] numbers = sc.nextLine().split("\\s");
		List<Integer> l = new ArrayList<Integer>();
		for ( String s : numbers ) {
			l.add(Integer.parseInt(s));
		}
		Collections.sort(l);
		String order = sc.nextLine();
		order = order.replace("A", "1").replace("B", "2").replace("C", "3");
		char[] puto = order.toCharArray();
		int[] puto2 = new int[3];
		int counter = 0;
		for ( char puto3 : puto ) {
			if ( puto3 == '1' ){
				puto2[counter] = 0;
			} else if ( puto3 == '2' ){
				puto2[counter] = 1;
			} else if ( puto3 == '3' ){
				puto2[counter] = 2;
			}
			counter++;
		}
		System.out.println(
			l.get(puto2[0])+" "+l.get(puto2[1])+" "+l.get(puto2[2])
		);
	}
}
