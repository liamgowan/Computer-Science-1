#include <stdio.h>

int main(void){
  int find=0;
  int numStudents=0;
  scanf("%d",&find);
  scanf("%d",&numStudents);
  double grades[numStudents];
  int sum=0;
  int i=0;
  int j=0;
  for(i;i<numStudents;i++){
    for(j;j<4;j++){
      int toAdd=0;;
      scanf("%d",&toAdd);
      sum+=toAdd;
    }
    j=0;
    grades[i]=(double)sum/4;
    sum=0;
  }