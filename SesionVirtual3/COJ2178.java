import java.util.Scanner;
public class COJ2178{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			String[] arrival = sc.nextLine().split(":");
			String[] exit = sc.nextLine().split(":");

			int arrivalHour = Integer.parseInt(arrival[0]);
			int arrivalMin = Integer.parseInt(arrival[1]);
			int exitHour = Integer.parseInt(exit[0]);
			int exitlMin = Integer.parseInt(exit[1]);
			int n = arrivalHour;
			int m = 0;

			m = arrivalMin-exitlMin;

			if(m<0){
				m+=60;
				n = getHoras(n,1);
			}

			n = getHoras(n,exitHour);

			String minR = "";
			String hourR = "";

			if(n<10){
				hourR = "0"+n;
			}else{
				hourR = ""+n;
			}

			if(m<10){
				minR = "0"+m;
			}else{
				minR = ""+m;
			}
			
			if(arrivalHour == exitHour && arrivalMin == exitlMin){
				System.out.println("00:00");
			}else{
				System.out.println(hourR+":"+minR);
			}
			
		}
	}

	public static int getHoras(int horas,int quitar){
		int aux = horas-quitar;
		if(aux<0){
			return 24+aux;
		}
		return aux;
	}
}