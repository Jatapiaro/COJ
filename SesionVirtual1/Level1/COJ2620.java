import java.util.Scanner;
public class COJ2620{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int r = sc.nextInt()*2;
			System.out.println(buildA(r*2));
		}
	}

	public static String buildA(int n){
		StringBuilder sb = new StringBuilder();
		sb.append("A");
		for(int i=0;i<n;i++){
			sb.append("a");
		}
		sb.append("h");
		return sb.toString();
	}
}