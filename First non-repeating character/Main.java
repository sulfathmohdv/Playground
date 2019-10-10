#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    scanf("%[^\n]s", str);
    char ch;
    int is_found;
    for(int i = 0; str[i] != '\0'; i++){
        is_found = 0;
        for(int j = 0; str[j] != '\0'; j++){
            if(str[i] == str[j] && i != j){
                is_found = 1;
                break;
            }
        }
        if(is_found == 0){
            ch = str[i];
            break;
        }
    }
    if(is_found == 0){
        printf("%c", ch);
    }
    else{
        printf("All the characters are repetitive");
    }
}