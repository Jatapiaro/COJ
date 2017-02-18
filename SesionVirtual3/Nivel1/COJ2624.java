import java.util.*;
public class COJ2624{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nCases = sc.nextInt();

		for(int i=0;i<nCases;i++){

			int dayz = sc.nextInt();
			int nCities = sc.nextInt();
			PriorityQueue<Integer> q = new PriorityQueue<Integer>();
			for(int j=0;j<nCities;j++){
				int x = sc.nextInt();
				q.add(x);
			}

			int howMany = 0;
			int restar = 0;

			while(true){
				
				if(q.size()>0){
				 	restar = q.poll();
					if(dayz-restar<0){
						break;
					}else{
						dayz-=restar;
						howMany++;
					}
				}else{
					break;
				}
			}
			System.out.println(howMany);

		}
	}
}