import java.util.Scanner;

public class COJ1905{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nUsuarios = sc.nextInt();
		sc.nextLine();
		for(int i = 0;i<nUsuarios;i++){
			String[] data = sc.nextLine().split("\\s");
			String init = data[0].substring(data[0].length() - 2);
			String end = data[0].charAt(data[0].length()-4)+""+data[0].charAt(data[0].length()-3);
			StringBuilder sb = new StringBuilder();
			sb.append(end);
			for(int j = data.length-1; j>=1 ;j--){
				if(j==1){
					sb.append(data[j]);
				}else{
					sb.append(data[j]+"*");
				}
			}
			sb.append(init);
			System.out.println(sb.toString());
		}
	}
}