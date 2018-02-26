#include <stdio.h>

int main(int argc, char const *argv[])
{
	int a;
	scanf("%d", &a);
	printf("%ld\n", a * (5+2*a));
	return 0;
}