import java.util.Scanner;
import java.util.Locale;
public class COJ3418{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a,e,i,o,u;
		a=e=i=o=u=0;

		while(sc.hasNext()){
			String str = sc.next();
			char[] chars = str.toCharArray();
			for(char c : chars){
				if(c=='a' || c=='A'){
					a++;
				}
				if(c=='e' || c=='E'){
					e++;
				}
				if(c=='i' || c=='I'){
					i++;
				}
				if(c=='o' || c=='O'){
					o++;
				}
				if(c=='u' || c=='U'){
					u++;
				}
			}
		}
		System.out.println(a+" "+e+" "+i+" "+o+" "+u);
	}
} 