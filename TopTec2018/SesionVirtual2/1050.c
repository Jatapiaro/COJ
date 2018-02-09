#include <stdio.h>

int greatestCommon(int a, int b) {
    while (a != 0 && b != 0) {
        if (a >= b) {
            a = a - b;
        } else {
            b = b - a;
        }
    }
    if (a == 0) {
    	return b;
    } else { 
    	return a;
    }
}

int numberOfGdc( int a ) {

	int counter = 0;
	for ( int i = 1; i < a; i++ ) {
		if ( greatestCommon(a, i) == 1 ) {
			counter++;
		}
	}

	return counter;

}

int main(int argc, char const *argv[]) {
	
	int a;
	scanf("%d", &a);
	printf("%d\n", numberOfGdc(a));
	return 0;
}