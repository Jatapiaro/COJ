import java.util.Scanner;
import java.util.*;
public class COJ3410{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		List<Integer> l = new ArrayList<Integer>();
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		int c = sc.nextInt();
		for(int i=0;i<c;i++){

			int year = sc.nextInt();
			int r = sc.nextInt();

			if(hm.containsKey(year)){
				int actual = hm.get(year);
				hm.put(year,(r+actual));
			}else{
				hm.put(year,r);
				l.add(year);
			}

			Collections.sort(l);
		}
		for(int j : l){
			System.out.println(j+" "+hm.get(j));
		}
	}
} 