#include <stdio.h>

int main(int argc, char const *argv[])
{
	int rad;
	scanf("%d", &rad);
	printf("%.4f\n", (3.141592653589793115997963468544*rad*rad)-0.00005);
	printf("%.4f\n", (4.0*(rad*rad))/2);
	return 0;
}