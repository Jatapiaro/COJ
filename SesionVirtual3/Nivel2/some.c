#include <stdio.h>
#include <math.h>
#include <stdlib.h>

long double gcd(long double a,long double b){
	if(b==0){
		return a;
	}else{
		return gcd(b,fmod(a,b));
	}
}

int main()
{
	long double v1,d1,v2,d2;
	int cases = 0;

	while(1){
		cases++;
		scanf("%Lf %Lf %Lf %Lf", &v1,&d1,&v2,&d2);
		if((v1+v2+d1+d2)!=0){
			long double edC = d1/v1;
			long double otherP = d2/v2;
			long double arriba = (d1*v2)+(d2*v1);
			long double abajo = v1*v2;
			long double arribaDiv = (arriba*1);
			long double abajoDiv = (abajo*2);
			long double gcdDiv = gcd(arribaDiv,abajoDiv);
			arribaDiv/=gcdDiv;
			abajoDiv/=gcdDiv;

			if(edC<otherP){
				if(fmod(arribaDiv,abajoDiv)==0){
					printf("Case #%d: You owe me a beer!\nAvg. arrival time: %0.Lf\n",cases,(arribaDiv/abajoDiv));
				}else{
					printf("Case #%d: You owe me a beer!\nAvg. arrival time: %0.Lf/%0.Lf\n",cases,arribaDiv,abajoDiv);
				}
			}else{
				if(fmod(arribaDiv,abajoDiv)==0){
					printf("Case #%d: No beer for the captain.\nAvg. arrival time: %0.Lf\n",cases,(arribaDiv/abajoDiv));
				}else{
					printf("Case #%d: No beer for the captain.\nAvg. arrival time: %0.Lf/%0.Lf\n",cases,arribaDiv,abajoDiv);
				}
			}

		}else{
			break;
		}
	}

	return 0;

}