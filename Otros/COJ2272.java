import java.util.Scanner;
import java.math.BigInteger;
public class COJ2272{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int length = 63300;
		boolean[] sieve = new boolean[63331];
		//System.out.println(sieve[0]);
		sieve[0] = true;
		sieve[1] = true;
		for(int i=2;i<=63300 && i<(int)Math.sqrt(63300);i++){
			if(!sieve[i]){
				for(int j=i*i;j<63300;j+=i){
					sieve[j] = true;
				}
			}
		}

		int r = sc.nextInt();

		for(int i=0;i<r;i++){

			long n = sc.nextLong();

			while(true){
				if(n==1 || n==0){
					System.out.println(2);
					break;
				}else{
					if(isPrime(n,sieve)){
						System.out.println(n);
						break;
					}
					n++;
				}
			}
		}

	}


	public static boolean isPrime(long n,boolean[] sieve){

		int sqrtn = (int)Math.floor(Math.sqrt(n));

		for(int i=2;i<=sqrtn;i++){
			if(!sieve[i]){
				if(n%i == 0){
					return false;
				}
			}
		}

		return true;
	}
}