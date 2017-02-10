import java.util.Scanner;
public class COJ1052{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int val = sc.nextInt();
			int val2 = (int)Math.pow(10,val)+1;

			boolean[] cribaBoolean = new boolean[val2];

			cribaBoolean[0] = true;
			cribaBoolean[1] = true;

			

			for(int i=2;i<=val2-1;i++){
				if(cribaBoolean[i]==false && Math.pow(i,2)<=val2){
					for(int j=i*i;j<val2;j+=i){
						cribaBoolean[j]=true;
					}
				}
			}


			int inicio = (int)Math.pow(10,(val-1));
			int fin = (int)Math.pow(10,(val));
			for(int i = inicio;i<fin;i++){
				if(!cribaBoolean[i]){
					int r = i;
					boolean f = true;
					while(r>=10){
						r/=10;
						if(cribaBoolean[r]){
							f = false;
							break;
						}
					}
					if(!cribaBoolean[r] && f){
						System.out.println(i);
					}
				}
			}
		}

	}
}