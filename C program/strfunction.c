#include<stdio.h>
#include<string.h>

main()
{
	char str[50];
	
	printf("Enter name: ");
	gets(str);
	printf("\nYour name is %d",strlen(str));
	printf("\nYour name is %s",strupr(str));
	printf("\nYour name is %s",strlwr(str));
	printf("\nYour name is %s",strrev(str));
}
