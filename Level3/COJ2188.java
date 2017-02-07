import java.util.Scanner;
public class COJ2188{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();

		for(int i=0;i<casos;i++){

			int zeros = sc.nextInt();
			int ones = sc.nextInt();
			int score = 0;

			if(zeros>=ones){
				int leftOnes = 0;
				int rightOnes = 0;
				while(ones>0){
					if(ones>0){
						leftOnes++;
						ones--;
					}
					if(ones>0){
						rightOnes++;
						ones--;
					}
				}
				score-=(leftOnes*leftOnes);
				score-=(rightOnes*rightOnes);
				score+=(zeros*zeros);
				System.out.println(score);
			}else{
				ones-=zeros;
				System.out.println((score-(ones*ones)));
			}

		}

	}
}