#include<stdio.h>
int main()
{
  int i,j,y,n;
  scanf("%d",&n);
int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  int count=0,count1=0;
  for(j=0;j<=n;j++)
  {
    count=1;
      for(i=j+1;i<n;i++)
      {
        if(a[i]==a[j])
        {
          count++;
        }
        if(count1<count)
        {
          count1=count;
          y=a[j];
        }
      }
  }
  printf("%d",y);
  return 0;
}