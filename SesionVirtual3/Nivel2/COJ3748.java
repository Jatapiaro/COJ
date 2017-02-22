import java.util.Scanner;
import java.math.BigDecimal;
public class COJ3748{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cases = 0;
		while(sc.hasNext()){
			cases++;
			double v1 = sc.nextDouble();
			double d1 = sc.nextDouble();
			double v2 = sc.nextDouble();
			double d2 = sc.nextDouble();
			if((v1+v2+d1+d2)!=0){

				double edC = d1/v1;
				double otherP = d2/v2;


				double arriba = (d1*v2)+(d2*v1);
				double abajo = v1*v2;




				double arribaDiv = (arriba*1);
				double abajoDiv = (abajo*2);

				double gcdDiv = gcd(arribaDiv,abajoDiv);



				arribaDiv/=gcdDiv;
				abajoDiv/=gcdDiv;

				String s = "";

				if(arribaDiv%abajoDiv==0){
					s = ""+(long)(arribaDiv/abajoDiv);
				}else{
					s = (long)(arribaDiv)+"/"+(long)(abajoDiv);
				}

				if(edC<otherP){
					System.out.println("Case #"+cases+": You owe me a beer!\nAvg. arrival time: "+s);
				}else{
					System.out.println("Case #"+cases+": No beer for the captain.\nAvg. arrival time: "+s);
				}



			}else{
				break;
			}
		}

	}


	public static double gcd(double a, double b){
		if(b==0){
			return a;
		}else{
			return gcd(b,a%b);
		}
	}
}