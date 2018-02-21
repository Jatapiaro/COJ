#include <stdio.h>

double normal( int rad ) {
	double pi = 3.14159265358979323846;
	return pi * (rad*rad);
}


double taxicab( int rad ) {
	return 4.0 * ( rad*rad ) / 2.0;
}

int main(int argc, char const *argv[])
{
	int rad;
	scanf("%d", &rad);
	printf("%.6f\n", normal(rad));
	printf("%.6f\n", taxicab(rad));
	return 0;
}