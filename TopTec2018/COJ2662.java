import java.util.*;
public class COJ2662 {
	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String,Integer>(); 
		
		Scanner sc = new Scanner(System.in);

		int cases = Integer.parseInt(sc.nextLine());
		int maj = 0;

		for ( int i = 0; i < cases; i++ ) {
			String line = sc.nextLine();
			line = returnOrederedString(line);
			if ( !hm.containsKey(line) ) {
				hm.put(line, 1);
			} else {
				int k = hm.get(line);
				k++;
				hm.put(line, k);
			}
		}

		System.out.println(printMap(hm));

	}

	public static String returnOrederedString( String s ) {
		String[] strs = s.split("\\s");
		Arrays.sort(strs);
		String r = "";
		for( String st : strs ) {
			r += st + " ";
		}
		return r;
	}

	public static int printMap(Map mp) {
    	Iterator it = mp.entrySet().iterator();
    	int max = 0;
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        int v = (Integer)pair.getValue();
	        if ( v > max ) {
	        	max = v;
	        }
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	    return max;
	}
}