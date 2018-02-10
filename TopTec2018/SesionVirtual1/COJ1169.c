#include <stdio.h>

int roomWithSpace( int rooms[], int nrooms ) {
	int i;
	for ( i = 0; i < nrooms; i++ ) {
		if ( rooms[i] == 1 ) {
			return i;
		}
	}
	return -1;
}

void addTwo( int rooms[], int * currentRoom, int nrooms ) {

	int curr = *currentRoom;
	if ( curr < nrooms ) {

		if ( rooms[curr] == 0 ) {
			rooms[curr] = 2;
			curr++;
			*currentRoom = curr;
		} else {
			rooms[roomWithSpace(rooms, nrooms)] = 2;
			rooms[roomWithSpace(rooms, nrooms)] = 2;
		}

	} else {
		curr++;
		*currentRoom = curr;
		rooms[roomWithSpace(rooms, nrooms)] = 2;
		rooms[roomWithSpace(rooms, nrooms)] = 2;
	}

}

void addOne( int rooms[], int * currentRoom, int nrooms ) {
	int curr = *currentRoom;
	if ( curr < nrooms ) {

		if ( rooms[curr] == 0 ) {
			rooms[curr] = 1;
			curr++;
			*currentRoom = curr;
		} else {
			rooms[roomWithSpace(rooms, nrooms)] = 2;
		}

	} else {
		curr++;
		*currentRoom = curr;
		rooms[roomWithSpace(rooms, nrooms)] = 2;
	}
}

void printArray( int rooms[], int nrooms ) {
	for ( int i = 0; i<nrooms; i++ ) {
		printf("%d\n", rooms[i]);
	}
}

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

		int nr = group/2;
		if ( group%2 == 0 ) {

			for ( int k = 0; k<nr; k++) {
				addTwo(rooms, &currentRoom, nrooms);
			}

		} else {
			for ( int k = 0; k<nr; k++) {
				addTwo(rooms, &currentRoom, nrooms);
			}
			addOne(rooms, &currentRoom, nrooms);
		}
		//printf("%d\n", currentRoom);

	}

	printArray(rooms, nrooms);

}