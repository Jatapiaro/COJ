
import java.util.*;

public class COJ2739 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int points = sc.nextInt();

		List<Integer> ids = new ArrayList<Integer>();

		HashMap<Integer, Node> nodes = new HashMap<Integer, Node>();

		for ( int i = 0; i < points; i++ ) {

			int id = sc.nextInt();
			ids.add(id);
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if ( i == 0 ) {
				nodes.put(id, new Node(id, x ,y));
			} else {
				Node n = new Node(id, x, y);
				nodes = updateSet(nodes, n);
			}

		}

		int start = sc.nextInt();
		int end = sc.nextInt();
		ids.remove(new Integer(start));
		ids.remove(new Integer(end));

		double minDist = Double.MAX_VALUE;

		List<List<Integer>> myLists = listPermutations(ids);
		for (List<Integer> al : myLists) {
			double r = distanceWithAll(start, end, nodes, al);
			minDist = Math.min(minDist, r);
		}
		System.out.printf(String.format(Locale.US, "%.2f%n", minDist));
		

	}

	public static double distanceWithAll ( int start, int end, 
		HashMap<Integer, Node> nodes, List<Integer> perm) {



		if ( perm.size() == 1 ) {

			double a = nodes.get(start).getDistanceToNode(perm.get(0));
			double b = nodes.get(perm.get(0)).getDistanceToNode(end);
			return  a + b;
		}

		int lastIndex = perm.size() - 1;

		double inner = 0.0;
		for ( int i = 0; i < lastIndex; i++ )	 {
			inner += nodes.get(perm.get(i)).getDistanceToNode(perm.get(i+1));
		}
		double head = nodes.get(start).getDistanceToNode(perm.get(0));
		double tail = nodes.get(perm.get(lastIndex)).getDistanceToNode(end);	

		return head + inner + tail;

	}

	public static HashMap<Integer, Node> updateSet( HashMap<Integer, Node> nodes,  Node n ) {

		Iterator it = nodes.entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry pair = (Map.Entry)it.next();
		    Node a = (Node)pair.getValue();
			double dis = distance(a,n);
			a.addDistanceToNode(n.id, dis);
			n.addDistanceToNode(a.id, dis);
		}
		nodes.put(n.id, n);
		return nodes;
	}

	public static double distance(Node a, Node b) {

		double x = Math.pow((a.x - b.x),2);
		double y = Math.pow((a.y - b.y),2);

		return Math.sqrt( x + y );

	}

	public static List<List<Integer>> listPermutations(List<Integer> list) {

	    if (list.size() == 0) {
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        result.add(new ArrayList<Integer>());
	        return result;
	    }

	    List<List<Integer>> returnMe = new ArrayList<List<Integer>>();

	    Integer firstElement = list.remove(0);

	    List<List<Integer>> recursiveReturn = listPermutations(list);
	    for (List<Integer> li : recursiveReturn) {

	        for (int index = 0; index <= li.size(); index++) {
	            List<Integer> temp = new ArrayList<Integer>(li);
	            temp.add(index, firstElement);
	            returnMe.add(temp);
	        }

	    }
	    return returnMe;
	}
}


class Node {

	public int id, x, y;
	public HashMap<Integer, Double> hm = new HashMap<Integer, Double>();

	public Node(int id, int x, int y) {
		this.id = id;
		this.x = x;
		this.y = y;
	}

	public void addDistanceToNode(int id, double dist) {
		hm.put(id, dist);
	}

	public double getDistanceToNode(int d) {
		return hm.get(d);
	}

	public boolean equals(Node n) {
    	return this.id == n.id;
    }
}