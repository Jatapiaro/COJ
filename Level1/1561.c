#include <stdio.h>
#include <stdlib.h>

int sum(long n){
	int sum;
	sum = 0;
	while (n != 0) {
	    sum += n % 10;
	    n /= 10;
	}
	return sum;
}

int digit(long n){
	return n%10;
}

int main(){	
	
	int n[100000];

	n[0]=0;
	for(int i = 1;i<100000;i++){
		n[i]=1;
	}
	for(int i = 0;i<100000;i++){
		printf("%d,", n[i]);
	}
	printf("%s\n");
}