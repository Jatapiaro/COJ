#include <stdio.h>

int main(int argc, char const *argv[])
{
	int d,h,m;
	scanf("%d %d %d", &d, &h, &m);
	/*
	* 11 days * 24 = 264 ( hours) * 60 = 15840
	* 11 hour * 60 = 660 = 16500
	* 11 minutes = 16511
	*/
	long time = ((60 * ((d*24) + h)) + m) - 16511;
	if ( time < 0 ) {
		printf("-1\n");
	} else {
		printf("%ld\n", time);
	}

}