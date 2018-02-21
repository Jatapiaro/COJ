import java.util.*;
public class COJ1137 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		HashMap<Integer, List<Integer>> hm = new HashMap<Integer, List<Integer>>();
		List<Integer> withArrivals = new ArrayList<Integer>();
		List<Integer> allNodes = new ArrayList<Integer>();
		int cases = 1;
		List<String> results = new ArrayList<String>();

		while( true ) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if ( a < 0 && b < 0 ) {
				break;
			} else if (a == 0 && b == 0){
				int nnodes = allNodes.size();
				if ( dfs(hm, findRoot(allNodes, withArrivals), nnodes)) {
					results.add("Case "+cases+" is a tree.");
				} else {
					results.add(("Case "+cases+" is not a tree."));
				}
				sc.nextLine();
				cases++;
				hm = new HashMap<Integer, List<Integer>>();
				allNodes = new ArrayList<Integer>();
				withArrivals = new ArrayList<Integer>();
			} else {
				if ( !hm.containsKey(a) ) {
					List<Integer> l = new ArrayList<Integer>();
					l.add(b);
					hm.put(a, l);
				} else {
					hm.get(a).add(b);
				}
				if (!allNodes.contains(a)) {
					allNodes.add(a);
				}
				if (!allNodes.contains(b)) {
					allNodes.add(b);
				}
				if (!withArrivals.contains(b)) {
					withArrivals.add(b);
				}
			}

		}
		for (String ssss :  results) {
			System.out.println(ssss);
		}

	}

	public static int findRoot( List<Integer> a, List<Integer> b) {
		//System.out.println(a + " -- "+b);
		for(Object o : b) {
			a.remove(o);
		}
		//System.out.println(a);
		return a.get(0);
	}

	public static boolean dfs( HashMap<Integer, List<Integer>> hm, int first, int nnodes ) {
		
		//System.out.println(hm);
		HashSet<Integer> visited = new HashSet<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(first);
		int visitedNodes = 0;

		while( !stack.isEmpty() ) {
			//System.out.println("Stack: "+stack);
			//System.out.println("Visited: "+visited);
			int top = stack.pop();
			//System.out.println("Top"+top);
			List<Integer> l = hm.get(top);
			if ( l != null ) {
				for ( int i : l ) {
					stack.push(i);
				}
			}

			//System.out.println(top +" -:- " + stack);
			if ( visited.contains(top) ) {
				return false;
			} else {
				visited.add(top);
				visitedNodes++;
			}

		}
		//System.out.println("Stack: "+stack);
		//System.out.println("Visited: "+visited);
		//System.out.println(nnodes + " : "+visited.size());
		if ( !stack.isEmpty() || visitedNodes != nnodes ) {
			return false;
		} else {
			return true;
		}

	}

}