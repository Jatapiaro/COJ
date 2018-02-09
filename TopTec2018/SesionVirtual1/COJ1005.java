import java.util.*;
import java.util.Comparator;

public class COJ1005 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cases = Integer.parseInt(sc.nextLine());

		for ( int c = 0; c < cases; c++ ) {

			int orders = Integer.parseInt(sc.nextLine());

			List<Order> list = new ArrayList<Order>();

			for ( int o = 0; o < orders; o++ ) {

				String[] inputs = sc.nextLine().split("\\s+");
				int startTime = Integer.parseInt(inputs[0]);
				int duration = Integer.parseInt(inputs[1]);
				int price = Integer.parseInt(inputs[2]);
				list.add(new Order(startTime, duration, price));

			}

			Collections.sort(list);
			//System.out.println(list);
			maxBenefit(list);

		}

	}

	public static void maxBenefit(List<Order> list) {

		int[] solution = new int[list.size()+1];
		solution[solution.length - 1] = 0;
		for ( int i = list.size() -1; i >= 0; i-- ) {
			
			Order aux = new Order();
            aux.startTime = list.get(i).endTime;
            int index = Collections.binarySearch(list, aux, Order.OrderComparator);
            //System.out.println(index);
            if (index < 0) { 
            	index = 0 - index - 1;
            }
            solution[i] = Math.max(solution[i + 1], list.get(i).price + solution[index]); 
		}
			
		System.out.println(solution[0]);

	}
}

class Order implements Comparable<Order>{

	public int startTime, duration, endTime, price, benefit;
	public boolean declined = false;

	public Order(){}

	public Order( int startTime, int duration, int price ) {

		this.startTime = startTime;
		this.duration = duration;
		this.endTime = startTime + duration;
		this.price = price;
		this.benefit = 0;

	}

	@Override
	public int compareTo( Order other ) {
		return this.startTime - other.startTime;
	}

	@Override
	public String toString() {
		return this.startTime + " --> " + this.price;
	}

	public static Comparator<Order> OrderComparator = new Comparator<Order>() {

		public int compare(Order o, Order o2) {

			return o.startTime - o2.startTime;

		}

	};

}