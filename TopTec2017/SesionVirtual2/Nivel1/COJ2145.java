import java.util.*;
public class COJ2145{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();

		for(int i=0;i<casos;i++){
			ArrayList<Integer> l = new ArrayList<Integer>();
			for(int j =0;j<10;j++){
				l.add(sc.nextInt());
			}
			Collections.sort(l);
			l.remove(0);
			l.remove(l.size()-1);
			int n = 0;
			for(int k=0;k<l.size();k++){
				n+=l.get(k);
			}
			System.out.println((i+1)+" "+n);
		}

	}
}