#include <stdio.h>

int main(int argc, char const *argv[]) {

	int nrooms, gguest;
	scanf("%d %d", &nrooms, &gguest);

	int rooms[nrooms];

	for ( int i = 0; i<nrooms; i++ ) {
		rooms[i] = 0;
	}


	int currentRoom = 0;

	for ( int i = 0; i<gguest; i++ ) {
		int group;
		scanf("%d", &group);

		int rooms = group/2;
		

	}

}