import java.util.Scanner;
///Unsolved///
public class COJ2188{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


		int casos = sc.nextInt();

		for(int i=0;i<casos;i++){

			long zeros = sc.nextLong();
			long ones = sc.nextLong();
			long score = 0;

			if(zeros>=ones){
				long leftOnes = 0;
				long rightOnes = 0;
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
			}else if(ones-zeros==1){
				System.out.println(-1);
			}else{
				int[] newResult = new int[(int)zeros+1];
				int arrPos = 0;

				while(ones>0){
					newResult[arrPos]+=1;
					ones--;
					arrPos++;
					if(arrPos==newResult.length){
						arrPos=0;
					}
				}

				score = 0;
				for(int j=0;j<newResult.length;j++){
					if(zeros>0){
						score-=(((long)newResult[j]*(long)newResult[j]));
						score+=1;
						zeros--;
					}else{
						score-=((long)newResult[j]*(long)newResult[j]);
					}
				}

				System.out.println(score);

			}

		}

	}
}
