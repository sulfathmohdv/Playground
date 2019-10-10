#include <stdio.h>
int main() {
	int n,temp,fd,id,sum;
  scanf("%d",&n);
  temp=n;
  id=n%10;
  while(n>=10){
    n=n/10;
  }
  fd=n;
  sum =fd+id;
  printf("%d",sum);
	return 0;
}