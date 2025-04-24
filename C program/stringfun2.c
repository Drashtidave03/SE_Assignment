#include<stdio.h>
#include<string.h>

main()
{
	char str[50], str2[50],*p;
	int ans;
	
	printf("Enter first name: ");
	gets(str);
	//printf("Enter name Last name: ");
	//gets(str2);
	
	//ans = strcmpi(str,str2); // case incensetive 
	//printf("ans is %d",ans);	
	
	p = strchr(str,'h');
	printf("Position is %d",p-str+1);
		
}
