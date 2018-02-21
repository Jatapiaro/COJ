#include <stdio.h>

int mcd(int a, int b) {

	while( b!=0 ){
		int t = b;
		b = a%b;
		printf("%d - ", a);
		a = t;
	}
	printf("\n");
	return a;

}

int main(int argc, char const *argv[])
{
	mcd(65,60);
	return 0;
}