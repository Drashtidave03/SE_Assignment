#include<stdio.h>
main(){
	int a[5] = {1,2,3,4,5},*p,i;
	p=a;
	
	for(i=0;i<5;i++)
	{
		printf("\n %d",*p);
		printf("\n %d Address is ",p);
		p++;
	}
}
//
