#include <stdio.h>

int numberOfOnes(int n){

	int nO = 0;
	while(n!=0){
		if((n&1) == 1){
			nO++;
		}
		n = n>>1;
	}

	return nO;

}

int main(){
	int n;
	int sobrevive = 0;
	while(scanf("%d",&n)!=EOF){
		int count = numberOfOnes(n);
		//printf("%d\n",count);
		if(count%2==0){
			sobrevive++;
		}
	}
	printf("%d\n",sobrevive);
}