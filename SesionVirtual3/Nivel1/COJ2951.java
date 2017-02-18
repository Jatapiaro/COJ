import java.util.*;
public class COJ2951{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		int nCases = Integer.parseInt(sc.nextLine());

		for(int i=0;i<nCases;i++){
			char[] c = sc.nextLine().toCharArray();
			Arrays.sort(c);
			String n = new String(c);
			if(!hm.containsKey(n)){
				hm.put(n,1);
			}
		}

		System.out.println(hm.size());


	}
}