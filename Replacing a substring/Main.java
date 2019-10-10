#include <stdio.h>
#include <string.h>
#include<stdlib.h>
int main()
{
  char text[100],word[10],rpwrd[10],str[10][10];
  int i=0,j=0,k=0,w,p;
      gets(text);
      scanf("%s",word);
      scanf("%s",rpwrd);
      p=strlen(text);
      for (k=0; k<p; k++)
      {
        if (text[k]!=' ')
        {
          str[i][j] = text[k];
          j++;
        }
        else
        {
          str[i][j]='\0';
          j=0; i++;
        }
      }
  str[i][j]='\0';
  w=i;
  for (i=0; i<=w; i++)
  {
    if(strcmp(str[i],word)==0)
      strcpy(str[i],rpwrd);
    printf("%s ",str[i]);
  }
  return 0;
}