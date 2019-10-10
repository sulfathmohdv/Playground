# include <stdio.h>
# include <string.h>
# include <stdlib.h>
int  Rotation_check(char *str1, char *str2)
{
int size1 = strlen(str1);
int size2 = strlen(str2);
char *temp;
void *ptr;
if (size1 != size2)		
	return 0;
temp = (char *)malloc(sizeof(char)*(size1*2 + 1)); 
temp[0] = '\0';
strcat(temp, str1);
strcat(temp, str1);
ptr = strstr(temp, str2); 	     
   free(temp);		    
if (ptr != NULL)
	return 1;
else
	return 0;
}
int main()
{
    char st1[20], st2[20];
    scanf("%s", st1);
    scanf("%s", st2);
	if (Rotation_check(st1, st2))
		printf("Yes");
	else
		printf("No");
	return 0;
}