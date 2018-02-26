import java.util.*;
public class COJ2815 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = Integer.parseInt(sc.nextLine());
		for (int x = 0; x<i; x++) {
			String[] strs = sc.nextLine().split("\\s");
			String a = strs[0];
			String b = strs[1];
			int y = 0;
			while (a.contains(b)) {
				a = a.replace(b, "");
				y++;
			}
			System.out.println(y);
		}

	}

}