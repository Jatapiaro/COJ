#include <stdio.h>
#include <stdlib.h>

void printHow( int n ) {

  if ( n == 0) {
    printf("none\n");
  } else if ( n == 1 ) {
    printf("one\n");
  } else {
    printf("both\n");
  }

}

int main(int argc, char const *argv[]) {

  int dogOneA, dogOneB, dogTwoC, dogTwoD,
    post, milk, garb;

  static int dogA[1000];
  static int dogB[1000];

  scanf("%d %d %d %d", &dogOneA, &dogOneB, &dogTwoC, &dogTwoD);
  scanf("%d %d %d", &post, &milk, &garb);


  int currIndex = 0;
  int t = 1;
  while( t == 1 ) {
    for ( int k = 0; k<dogOneA; k++ ) {
      if ( currIndex >= 1000 ) {
        t = 0;
        break;
      } else {
        dogA[currIndex] = 1;
        currIndex++;
      }
    }
    for ( int k = 0; k<dogOneB; k++ ) {
      if ( currIndex >= 1000 ) {
        break;
      } else {
        currIndex++;
      }
    }
  }

  currIndex = 0;
  t = 1;
  while( t == 1 ) {
    for ( int k = 0; k<dogTwoC; k++ ) {
      if ( currIndex >= 1000 ) {
        t = 0;
        break;
      } else {
        dogB[currIndex] = 1;
        currIndex++;
      }
    }
    for ( int k = 0; k<dogTwoD; k++ ) {
      if ( currIndex >= 1000 ) {
        break;
      } else {
        currIndex++;
      }
    }
  }

  int p1 = ( dogA[post-1] + dogB[post-1] );
  printHow(p1);
  int p2 = ( dogA[milk-1] + dogB[milk-1] );
  printHow(p2);
  int p3 = ( dogA[garb-1] + dogB[garb-1] );
  printHow(p3);


}
