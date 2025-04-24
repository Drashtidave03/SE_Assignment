#include<stdio.h>

struct emp{
	int no;
	char name[20];

};

main(){
	
	struct emp s1;
	s1.no;
	printf("Enter your number: ");
	scanf("%d",&s1.no);
	printf("Enter your name: ");
	scanf("%s",&s1.name);
	
	printf("No is %d",s1.no);
	printf("\nName is %s",s1.name);
	
	
}
