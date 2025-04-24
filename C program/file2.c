#include<stdio.h>

main()
{
	int no;
	char str[100];
	
	FILE *fp;
	fp = fopen("abc.txt","r");
	
	
	//fscanf(fp,"%s",name);
	fgets(str,100,fp);
	
	printf("String %s",str);
	
	
	fclose(fp);
}
