#include<stdio.h>
main(){
	int no, r, sum=0;
	
	printf("\nEnter no:");
	scanf("%d",&no);
	
	while(no>0) //123
	{
		r=no%10; // 123%10 = 3
		no=no/10; // 123/10 = 12 
		sum=sum+r; // 0+3=3 
	}
	
	printf("\n no of digit is %d", sum);
	}
