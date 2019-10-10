#include<stdio.h>
int main()
{
    char string[100], c;
    int i, key;
    //Input of the encoded word and key value
    scanf("%[^\n]s",string);
    scanf("%d",&key);			
    key=key%26;
    //Loop to Decode the given word 
    for(i = 0; string[i] != '\0';i++)		
    {
        c = string[i];
        //For lower case alphabets
        if(c >= 'a' && c <= 'z')			
        {
            c = c - key;
            if(c < 'a')
            {
                c = c + 'z' - 'a' + 1;
            }
            
            string[i] = c;
        }
        //For Upper case alphabets
        else if(c >= 'A' && c <= 'Z')		
        {
            c = c - key;
            
            if(c < 'A')
            {
                c = c + 'Z' - 'A' + 1;
            }
            string[i] = c;
        }
    }
    //Printing the Output
    printf("%s", string);					
    
    return 0;
}