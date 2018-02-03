import java.util.*;
public class COJ1028 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while( sc.hasNext() ) {
			
			char[] sequence = sc.next().toCharArray();
			char[] subsequence = sc.next().toCharArray();

			if ( sequence.length > subsequence.length ){
				System.out.println("No");
				continue;
			}

			if ( sequence.length == 0 || subsequence.length == 0 ) {
				System.out.println("No");
				continue;
			}


			int sequencePointer = 0;
			int aux = 0;

			for( char c : subsequence ) {
				if ( sequencePointer != sequence.length ) {
					if ( c == sequence[sequencePointer] ) {
						aux++;
						sequencePointer++;
					}
				}
			}

			if ( aux == sequence.length ){
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}

		
	}
}