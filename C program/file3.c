#include<stdio.h>

main()
{
	char str[500];
	
	FILE *fp;
	fp = fopen("abc.txt","w+");
	
	fprintf(fp,"My name is drashti %s",str);
	rewind(fp);
	fgets(str,100,fp);
	
	printf("%s",str);
		
	fclose(fp);
}
