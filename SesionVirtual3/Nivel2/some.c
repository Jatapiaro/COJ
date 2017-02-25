#include <stdio.h>
#include <math.h>
#include <stdlib.h>

//3408
long gcd(long a,long b){
	if(b==0){
		return a;
	}else{
		return gcd(b,a%b);
	}
}

int main()
{
	long v1,d1,v2,d2;
	int cases = 0;

	while(1){
		cases++;
		scanf("%ld %ld %ld %ld", &v1,&d1,&v2,&d2);
		if((v1+v2+d1+d2)!=0){

			/*long primerGdc = gcd(v1,d1);
			long segundoGdc = gcd(v2,d2);

			v1/=primerGdc;
			d1/=primerGdc;

			v2/=segundoGdc;
			d2/=segundoGdc;*/
			
			long d1TimesV2 = d1*v2;
			
			long d2TimesV1 = d2*v1;

			long sumaAbajo = v1*v2;

			long sumaArriba = (d1*v2)+(v1*d2);

			/*long gcdSuma = gcd(sumaArriba,sumaAbajo);

			sumaAbajo/=gcdSuma;
			sumaArriba/=gcdSuma;*/

			long divisionArriba = (sumaArriba*1);

			long divisionAbajo = (sumaAbajo*2);

			long tercerGdc = gcd(divisionArriba,divisionAbajo);

			divisionAbajo/=tercerGdc;
			divisionArriba/=tercerGdc;

			if(d1TimesV2<d2TimesV1){
				//Aqui si gana el cap
				int e = 0;
				if(divisionArriba%divisionAbajo==0){
					printf("Case #%d: You owe me a beer!\nAvg. arrival time: %ld\n",cases,(divisionArriba/divisionAbajo));
				}else{
					printf("Case #%d: You owe me a beer!\nAvg. arrival time: %ld/%ld\n",cases,divisionArriba,divisionAbajo);
				}
			}else{
				if(divisionArriba%divisionAbajo==0){
					printf("Case #%d: No beer for the captain.\nAvg. arrival time: %ld\n",cases,(divisionArriba/divisionAbajo));
				}else{
					printf("Case #%d: No beer for the captain.\nAvg. arrival time: %ld/%ld\n",cases,divisionArriba,divisionAbajo);
				}
			}
		}else{
			break;
		}
	}

	return 0;

}