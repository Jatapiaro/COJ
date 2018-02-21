#include <stdio.h>

double normal( int rad ) {
	double pi = 3.141592653589793115997963468544;
	return (pi * (rad*rad)) - 0.00005;
}


double taxicab( int rad ) {
	return 4.0 * ( rad*rad ) / 2.0;
}

int main(int argc, char const *argv[])
{
	int rad;
	scanf("%d", &rad);
	printf("%.4f\n", normal(rad));
	printf("%.4f\n", taxicab(rad));
	return 0;
}