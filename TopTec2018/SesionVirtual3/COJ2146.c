#include <stdio.h>

int main(int argc, char const *argv[])
{
	//n(n − 3) / 2
	long a,b;
	scanf("%ld %ld", &a, &b);
	long sides = (b*(b-3))/2;
	if ( sides == a ) {
		printf("yes\n");
	} else {
		printf("no\n");
	}
	return 0;
}