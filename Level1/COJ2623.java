import java.util.Scanner;

public class COJ2623{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String s = sc.nextLine();
			int mid = s.length() / 2; //get the middle of the String
			if(s.length()%2 == 0){
				String[] parts = {s.substring(0, mid),s.substring(mid)};
				StringBuilder a = new StringBuilder();
				StringBuilder b = new StringBuilder();
				a.append(parts[0]);
				b.append(parts[1]);
				a.reverse();
				b.reverse();
				a.append(b.toString());
				System.out.println(a.toString());
			}else{
				String[] parts = {s.substring(0, mid),s.substring(mid+1),
					s.substring(mid,mid+1)};
				StringBuilder a = new StringBuilder();
				StringBuilder b = new StringBuilder();
				a.append(parts[0]);
				b.append(parts[1]);
				a.reverse();
				b.reverse();
				a.append(parts[2]);
				a.append(b.toString());
				System.out.println(a.toString());
			}

		}

	}
}