#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100
int countOccurrences(char * str, char * toSearch);
void upper_string(char s[]) {
   int c = 0;
 
   while (s[c] != '\0') {
      if (s[c] >= 'a' && s[c] <= 'z') {
         s[c] = s[c] - 32;
      }
      c++;
   }
}
int main()
{
    char str[MAX_SIZE];
    char toSearch[MAX_SIZE];
    int count;
    scanf("%[^\n]s",str);
    upper_string(str);
    scanf("%s",toSearch);
    upper_string(toSearch);
    count = countOccurrences(str, toSearch);
    printf("%d", count);
    return 0;
}
int countOccurrences(char * str, char * toSearch)
{
    int i, j, found, count;
    int stringLen, searchLen;
    stringLen = strlen(str);      
    searchLen = strlen(toSearch); 
    count = 0;
    for(i=0; i <= stringLen-searchLen; i++)
    {
        /* Match word with string */
        found = 1;
        for(j=0; j<searchLen; j++)
        {
            if(str[i + j] != toSearch[j])
            {
                found = 0;
                break;
            }
        }
        if(found == 1)
        {
            count++;
        }
    }
    return count;
}