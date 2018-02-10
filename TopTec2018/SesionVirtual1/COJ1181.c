#include <stdio.h>

int main(int argc, char const *argv[])
{
	
	long females[100];
	long males[100];
	for ( int i = 0; i<100; i++ ) {
		females[i] = 0;
		males[i] = 0;
	}

	females[0] = 1;
	males[0] = 0;
	females[1] = 1;
	males[1] = 1;
	females[2] = 2;
	males[2] = 2;

	for(int i = 2; i<100; i++) {
		females[i] = 1 + males[i-1];
		males[i] = males[i-1] + females[i-1];
	} 

	while( 1 ) {
		int c;
		scanf("%d", &c);
		if ( c == -1 )
			break;
		printf("%ld %ld\n", males[c], (females[c] + males[c]));	
	}

	return 0;
}