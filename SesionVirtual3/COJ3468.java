import java.util.*;
// 3468
public class COJ3468{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();

		int nCasos = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<nCasos;i++){
			char[] letras = sc.nextLine().toCharArray();
			Arrays.sort(letras);
			String rr = new String(letras);
			if(hm.containsKey(rr)){
				int newR = hm.get(rr);
				System.out.println(newR);
				newR++;
				hm.put(rr,newR);
			}else{
				System.out.println(0);
				hm.put(rr,1);
			}
		}
	}
}