import java.util.Scanner;
public class COJ1561{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		boolean[] cribaBoolean = new boolean[1000001];

		for(int i = 0;i<cribaBoolean.length;i++){
			cribaBoolean[i] = true;
		}

		cribaBoolean[0] = false;
		cribaBoolean[1] = false;

		for(int i=2;i<=1000000;i++){
			if(cribaBoolean[i] && Math.pow(i,2)<=1000000){
				for(int j=i*i;j<=1000000;j+=i){
					cribaBoolean[j]=false;
				}
			}
		}


		int casos = sc.nextInt();
		for(int i = 0; i<casos; i++){
			long a = sc.nextLong();
			long b = sc.nextLong();
			if(a==b){
				int r = (int)Math.floor(Math.sqrt(a));
				if(cribaBoolean[r]){
					System.out.println(1);
				}else{
					System.out.println(0);
				}
			}else{
				double ba = Math.sqrt(a);
				double bb = Math.sqrt(b);
				if(ba != Math.ceil(ba)){
					ba = Math.ceil(ba);
				}
				if(bb != Math.floor(bb)){
					bb = Math.floor(bb);
				}
				int x = (int)ba;
				int y = (int)bb;
				//System.out.println(x+" - "+y);
				int contador = 0;
				for(int j=x;j<=y;j++){
					if(cribaBoolean[j]){
						contador++;
					}
				}
				System.out.println(contador);
			}
		}


	}
}