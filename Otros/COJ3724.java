import java.util.*;

public class COJ3724{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			//07:05:45PM
			//0123456789
			String s = sc.nextLine();
				String time = ""+s.charAt(8) + s.charAt(9);
				if(time.equals("AM")){
				//System.out.println("En AM");
					String g = ""+s.charAt(0) + s.charAt(1);
					int h = Integer.parseInt(g);
					if(h==12){
						System.out.println("00"+s.substring(2,8));
					}else{
						System.out.println(s.substring(0,8));
					}
				}else{
					String g = ""+s.charAt(0) + s.charAt(1);
					int h = Integer.parseInt(g);
					if(h==12){
						System.out.println(s.substring(0,8));
					}else{
						h+=12;
						String l = s.substring(2,8);
						l=h+l;
						System.out.println(l);
					}				
				}
		}

	}
}