#include<stdio.h>
int main()
{
  //Type your code here
  int num1,num2,num3;
  scanf("%d %d %d",&num1,&num2,&num3);
  if(num1>num2)
  {
    printf("num1 is the greatest");
  }
  else if(num1<num2)
  {
    printf("num2 is the greatest");
  }
  else 
  {
    printf("both number are equal");
}
    
  return 0;
}