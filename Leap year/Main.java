#include<stdio.h>
int main()
{
  //Type your code here
  int yr;
  scanf("%d",&yr);
  if(yr%4==0&&(yr%400||yr%100!=0))
     {
    printf("Leap year");
      }
  else
  {
    printf("Not Leap year");
  }
  return 0;
}
     
 