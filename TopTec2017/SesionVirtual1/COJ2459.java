import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class COJ2459{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(sc.hasNext()){
			
			String[] p1 = sc.nextLine().replaceAll("[ ]+", " ").trim().split("\\s");
			ArrayList<String> player1 =new ArrayList<String>(Arrays.asList(p1));
			String[] p2 = sc.nextLine().replaceAll("[ ]+", " ").trim().split("\\s");
			ArrayList<String> player2 =new ArrayList<String>(Arrays.asList(p2));
			String[] p3 = sc.nextLine().replaceAll("[ ]+", " ").trim().split("\\s");
			ArrayList<String> player3 =new ArrayList<String>(Arrays.asList(p3));

			int score1 = score(player1,player2,player3);
			int score2 = score(player2,player1,player3);
			int score3 = score(player3,player1,player2);

			System.out.println(score1+"/"+score2+"/"+score3);

			if(sc.hasNextLine()){
				sc.nextLine();
			}
		}
	}

	public static int score(ArrayList<String> player1,ArrayList<String> player2,ArrayList<String> player3){
		int score = 0;
		for(String s : player1){
			if(!player2.contains(s) && !player3.contains(s)){
				score+=3;
			}else if(!player2.contains(s) && player3.contains(s)){
				score+=2;
			}else if(player2.contains(s) && !player3.contains(s)){
				score+=2;
			}else if(player2.contains(s) && player3.contains(s)){
				score+=1;
			}
		}
		return score;
	}
}