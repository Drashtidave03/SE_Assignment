#include<stdio.h>

main()
{
	int no;
	char name[10];
	
	FILE *fp;
	fp = fopen("abc.txt","w");
	
	printf("Enter No: ");
	scanf("%d",&no);
	printf("Enter Name: ");
	scanf("%s",&name);
	
	fprintf(fp,"No is -- %d",no);
	fprintf(fp,"\nName is --%s",name);
	
	
	fclose(fp);
}
