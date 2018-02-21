#include <stdio.h>

int main(int argc, char const *argv[])
{
	int factoriales[] = {1, 2, 6, 24, 120, 720, 
		5040, 40320, 362880, 3628800
	};

	int cases;
	scanf("%d", &cases);
	for ( int i = 0; i<cases; i++ ) {
		int c;
		scanf("%d", &c);
		printf("Case #%d: %d\n", (i+1), factoriales[c-1]);
	}
	return 0;
}