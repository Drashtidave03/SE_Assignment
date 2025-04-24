#include<stdio.h>

struct emp{
	int no;
	char name[20];

};

main(){
	
	struct emp s1[10];
	int n,i;
	printf("Enter number of users :");
	scanf("%d",&n);
	
	for(i=0;i<n;i++)
	{
		printf("Enter your no:");
		scanf("%d",&s1[i].no);
		printf("Enter your name:");
		scanf("%s",s1[i].name);
	}
	printf("\n No \t name \n");
	
	for(i=0;i<n;i++)
	{
		printf("\n %d \t %s \n",s1[i].no,s1[i].name);
	}

}
