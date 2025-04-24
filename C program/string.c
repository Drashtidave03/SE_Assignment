#include<stdio.h>
main()
{
	char str[50];
	
	printf("Enter name: ");
	//scanf("%s",str);// c for only one character, s for one word and for the full use gets
	gets(str);
	//printf("Your name is",str);
	printf("Your name is ");
	puts(str);
	
	
}
