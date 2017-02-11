#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const *argv[]){
	int participantes;

	scanf("%d",&participantes);

	int i;
	for(i=0;i<participantes;i++){
		int a,b,c,d,e,f,g,h,j,k;
		scanf("%d %d %d %d %d %d %d %d %d %d",&a,&b,&c,&d,&e,&f,&g,&h,&j,&k);
		printf("%d\n", (b+c+d+e+f+g+h+j));
	}
}