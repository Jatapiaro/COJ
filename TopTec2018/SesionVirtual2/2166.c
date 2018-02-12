#include <stdio.h>

int main(int argc, char const *argv[])
{
	int cases;
	scanf("%d", &cases);
	for ( int i = 0; i < cases; i++ ) {

		int n, k, counter;
		scanf("%d %d", &n, &k);
		counter = 0;

		int participants[n];

		for ( int j = 0; j<n; j++) {
			int val;
			scanf("%d", &val);
			participants[j] = val;
		}

		int check = participants[k-1];

		if ( check > 0 ) {
			for ( int j = 0; j<n; j++) {
				if ( participants[j] >= check ) {
					counter++;
				}
			}
		} else {	
			for ( int j = 0; j<n; j++) {
				if ( participants[j] > 0 ) {
					counter++;
				}
			}

		}



		printf("%d\n", counter);

	}
}