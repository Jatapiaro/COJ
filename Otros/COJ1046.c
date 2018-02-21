#include <stdio.h>

int main(int argc, char const *argv[])
{
	
	int cases;
	scanf("%d", &cases);
	for ( int k = 0; k<cases; k++ ) {

		int a,b;
		scanf("%d %d", &a, &b);
		
		long sum = 0;
		for (int i = a; i<=b; i++){
			sum += ((i)*(i+1)*(i+2));
		}
		printf("%ld\n", sum%100);

	}
	return 0;
}