#include <stdio.h>

int main(){
	
	int nCasos,robotK;

	scanf("%d",&nCasos);

	for(int i=0;i<nCasos;i++){
		
		scanf("%d",&robotK);

		long time = 0;
		/*
		*Siempre se empieza con el numero de robots
		*en uno
		*/
		long totalRobots = 1;
		long cantidadDeRobots = 1;


		while(robotK!=1){
			long newTot = (robotK*cantidadDeRobots);
			time+=(robotK*robotK*robotK);
			cantidadDeRobots = newTot;
			totalRobots+=newTot;
			
			robotK--;
		}

		printf("%ld %ld\n",totalRobots,time);


	}
}