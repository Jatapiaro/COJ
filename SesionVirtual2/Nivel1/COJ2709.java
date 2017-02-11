import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class COJ2709{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			List<Integer> l = new ArrayList<Integer>();

			int numE = sc.nextInt();

			int chapts = sc.nextInt();

			for(int i=0;i<chapts;i++){
				int s = sc.nextInt();
				if(!l.contains(s)){
					l.add(s);
				}
			}

			System.out.println(numE-l.size());
		}
	}

}