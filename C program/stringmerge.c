#include<stdio.h>
#include<string.h>

main()
{
	char str[50], str2[50];
	int ans;
	
	printf("Enter name first name: ");
	gets(str);
	printf("Enter name Last name: ");
	gets(str2);
	strcat(str,str2);
	printf("Your full name is: ");
	puts(str);
	//strcpy(str,"Hellloooo");
	//printf("\ncopy string is %s",str);
	
	//ans = strcmp(str,str2);
	//printf("\nCamparition is %d",ans);

}
