import java.util.Scanner;
public class COJ2105{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			
			int n = sc.nextInt();
			int m = sc.nextInt();

			int totalT = 0;

			char[][] grid = new char[n][m];

			sc.nextLine();

			for(int i=0;i<n;i++){
				char[] c = sc.nextLine().toCharArray();
				for(int j=0;j<m;j++){
					if(c[j] == '+'){
						totalT++;
					}
					grid[i][j] = c[j];
				}
			}

			int tot = 0;
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){

					if(grid[i][j] == '+'){

						int xP1 = i+1;
						int xM1 = i-1;

						int yP1 = j+1;
						int yM1	= j-1;

						if(xP1 >= 0 && xP1<n && xM1 >= 0 && xM1<n && yP1 >= 0 && yP1<m && yM1 >= 0 && yM1<m){
							if(grid[i][yP1]=='+' && grid[i][yM1]=='+' && grid[xP1][j]=='+' && grid[xM1][j]=='+'){
								tot++;
							}
						}

					}

				}
			}

			System.out.println((totalT-tot));

		}

	}

}