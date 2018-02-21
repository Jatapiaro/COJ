//No ha pasado perros
import java.util.*;
public class COJ1094 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cases = Integer.parseInt(sc.nextLine());

		for ( int i = 0; i<cases; i++ ) {

			HashMap<String, HashSet<String>> hm = new HashMap<String, HashSet<String>>();
			int pairs = Integer.parseInt(sc.nextLine());
			for( int k = 0; k<pairs; k++) {
				String[] f = sc.nextLine().split("\\s");
				String a = f[0];
				String b = f[1];

				if ( !hm.containsKey(a) ) {
					HashSet<String> aHs = new HashSet<String>();
					aHs.add(b);
					hm.put(a, aHs);
				} else {
					hm.get(a).add(b);
				}

				if ( !hm.containsKey(b) ) {
					HashSet<String> bHs = new HashSet<String>();
					bHs.add(a);
					hm.put(b, bHs);
				} else {
					hm.get(b).add(a);
				}
			}

			Iterator it = hm.entrySet().iterator();
			while (it.hasNext()) {
			    Map.Entry pair = (Map.Entry)it.next();
			    //System.out.println(pair.getKey() + " = " + pair.getValue());
			    String key = (String)pair.getKey();
			    HashSet<String> h = (HashSet<String>)pair.getValue();
			    int tot = 0;
			    for (String s : h) {
			        HashSet<String> aux = hm.get(s);
			        if ( aux.contains(key) ) {
			        	tot+=aux.size()-1;
			        } else {
			        	tot+=aux.size();
			        }
			    }
			    System.out.println(tot);
			}

			System.out.println(hm);
			
		}
		
	}
}