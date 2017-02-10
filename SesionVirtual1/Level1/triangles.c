#include <stdio.h>
#include <stdlib.h>

int main(){
	
	int a,b,c;
	scanf("%d",&a);
	scanf("%d",&b);
	scanf("%d",&c);
	int sum = a+b+c;

	if((sum>180) || (sum<180)){
		printf("Error\n");
	}else if(a==60 && b==60 && b==60){
		printf("Equilateral\n");
	}else if((a==b && c!=a) || (a==c && b!=a) || (b==c && b!=a)){
		printf("Isosceles\n");
	}else if(a!=b && a!=c && b!=c ){
		printf("Scalene\n");
	}

	return 0;
}