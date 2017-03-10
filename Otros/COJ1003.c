#include <stdio.h>
#include <string.h>

int main(){

	int casos;

	scanf("%d",&casos);

	for(int i=0;i<casos;i++){
		int candidatos,regiones;
		scanf("%d %d",&candidatos,&regiones);
		int votes[candidatos];

		memset(votes,0,candidatos*sizeof(int));

		for(int j=0;j<regiones;j++){
			for(int k=0;k<candidatos;k++){
				int vi;
				scanf("%d",&vi);
				//printf("Up: %d\n",votes[k]);
				votes[k]+=vi;
			}
		}

		int max = -1;
		int maximo = -1;
		for(int k=0;k<candidatos;k++){
			if(votes[k]>maximo){
				max = k;
				maximo = votes[k];
			}
		}
		printf("%d\n",max+1);
	}

}