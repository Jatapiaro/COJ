import java.util.Scanner;
public class COJ3110{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] resultados = new String[1000000];
		resultados[0] = "3,0";
		resultados[1] = "17,0";
		resultados[2] = "0,2";

		int lastSeven = 2;
		int counter = 0;
		for(int i=3;i<1000000;i++){
			if(counter == 0){
				resultados[i] = "3,"+lastSeven;
				counter++;
			}else if(counter == 1){
				resultados[i] = "17,"+lastSeven;;
				counter++;
			}else{
				lastSeven+=2;
				resultados[i] = "0,"+lastSeven;
				counter=0;
			}
		}

		/*for(int i=0;i<12;i++){
			System.out.println(resultados[i]);
		}*/

		while(sc.hasNext()){
			
			int x = sc.nextInt();
			x--;
			String[] ress = resultados[x].split(",");
			long iterador = Long.parseLong(ress[1]);

			StringBuilder sb = new StringBuilder();
			if(Integer.parseInt(ress[0])!=0){
				sb.append(ress[0]);
			}
			
			for(int i=0;i<iterador;i++){
				sb.append("7");
			}
			System.out.println(sb.toString());
		}
	
	}
}