import java.util.*;
public class COJ2230 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vectorLength = sc.nextInt();

		List<Integer> a = new ArrayList<Integer>();
		List<Integer> aClone = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		List<Integer> bClone = new ArrayList<Integer>();
		for ( int i = 0; i<vectorLength; i++ ) {
			int q = sc.nextInt();
			a.add(q);
			aClone.add(q);
		}
		for ( int i = 0; i<vectorLength; i++ ) {
			int q = sc.nextInt();
			b.add(q);
			bClone.add(q);
		}

		List<List<Integer>> aPerms = listPermutations(a);
		List<List<Integer>> bPerms = listPermutations(b);

		long min = Long.MAX_VALUE;

		for (List<Integer> aP : aPerms) {
			//System.out.println(aP);
			min = Math.min(min, distance(aP, bClone));
		}

		for (List<Integer> bP : bPerms) {
			//System.out.println(bP);
			min = Math.min(min, distance(bP, aClone));
		}

		System.out.println(min);


	}

	public static long distance ( List<Integer> a, List<Integer> b ) {
		//1*1 + 2*2 + (-12*3)
		//System.out.print(a +" --> ");
		//System.out.println(b);
		long res = 0;
		for ( int i = 0; i<a.size(); i++ ) {
			res += (a.get(i) * b.get(i));
		}
		return res;
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