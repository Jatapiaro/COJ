#include <stdio.h>

int binarySearch( int n, int counter ) {
	if ( n <= 0 ) {
		return counter;
	} else {
		n = n/2;
		counter++;
		return binarySearch(n, counter);
	}
}

int main(int argc, char const *argv[])
{
	int n;
	scanf("%d", &n);
	printf("%d\n", binarySearch(n, 0));
	return 0;
}