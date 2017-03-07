import java.util.*;
public class COJ2789{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<Integer>();
		while(sc.hasNext()){
			String[] s = sc.nextLine().split("\\+");
			for(String tr : s){
				
				l.add(Integer.parseInt(tr));
			}
			
			Collections.sort(l);
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<l.size()-1;i++){
				sb.append(l.get(i)+"+");
			}
			sb.append(l.get(l.size()-1));	
			System.out.println(sb.toString());
		}
	}
}