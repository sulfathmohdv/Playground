#include<stdio.h>
int main()
{
 int i,j,n[9999],m,t;
 scanf("%d",&m);
 for(i=1;i<m;i++)
  {
   scanf("%d",&n[i]);
  }
 for(i=1;i<m;i++)
  {
   for(j=1;j<i;j++)
    {
      if(n[j]>n[j+1])
       {
         t=n[j];
         n[j]=n[j+1];
         n[j+1]=t;
        }
    }
  }
   for(i=2;i<m;i++)
    {
     if(n[i-1]!=n[i]-1)
       {
          printf("%d",n[i]-1);
          break;
       }
  }
 return 0;
}