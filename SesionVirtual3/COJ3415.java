import java.util.Scanner;
public class COJ3415{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ncasos = sc.nextInt();
		sc.nextLine();

		for(int k=0;k<ncasos;k++){
			char[] seq = sc.nextLine().toCharArray();
			String s = "";
			for(int i=0;i<seq.length;i++){
				if(i%2!=0){
					int x = Character.getNumericValue(seq[i]);
					x*=2;
					s+=x;
				}else{
					s+=seq[i];
				}
			}
			char[] seq2 = s.toCharArray();
			int suma = 0;
			for(char c : seq2){
				suma+=Character.getNumericValue(c);
			}

			int rem = suma%10;
			if(rem==0){
				System.out.println(0);
			}else{
				System.out.println(10-rem);
			}
		}
	}
}