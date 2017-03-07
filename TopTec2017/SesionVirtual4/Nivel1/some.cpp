#include <iostream>
#include <algorithm> 
using namespace std;
//1118
int main() {
	while(1){
		int even,odd;
		cin >> even;
		cin >> odd;
		if(even+odd==0){
			break;
		}

		if(even==0 && odd!=0){
			long res = 1;
			for(int i=0;i<odd;i++){
				res*=5;
			}
			res*=2;
			cout << res << "\n";
		}else if(odd==0 && even!=0){
			if(even==1){
				cout << 9 << "\n";
			}else{
				long res = 4;
				for(int i=1;i<even;i++){
					res*=5;
				}
				res*=2;
				cout << res << "\n";
			}
		}else{
			int size = odd+even;
			char myints[size];
			for(int i=0;i<size;i++){
				myints[i] = 'o';
			}
			for(int i=0;i<even;i++){
				myints[i] = 'e';
			}
			long res = 0;
			do{
				long resX = 1;
				for(int i=0;i<size;i++){
					if(i==0 && myints[i] == 'e'){
						resX*=4;
					}else{
						resX*=5;
					}
				}
				res+=resX;
			}while(next_permutation(myints,myints+size));
			res*=2;
			cout << res << "\n";

		}
	}
}