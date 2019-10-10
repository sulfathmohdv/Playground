#include<stdio.h>
int main()
{
int arr_size;
  scanf("%d",&arr_size);
  int arr[10];
  for(int idx=0;idx<=arr_size-1;idx++)
  {
    scanf("%d",&arr[idx]);
  }
  int max_no;
  if(arr[0]>arr[1])
  {
    max_no=arr[0];
  }
  else{
    max_no=arr[1];
  }
  for(int idx=2;idx<=arr_size-1;idx++)
  {
    if(max_no<arr[idx])
    {
      max_no=arr[idx];
    }
  }
  printf("%d",max_no);
  return 0;
}