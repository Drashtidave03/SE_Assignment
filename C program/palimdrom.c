//palindrom no 121 == 121 123=321
#include<stdio.h>
main(){
	int no,r,sum=0,f;
	
	printf("Enter no:");
	scanf("%d",&no);
	
	f=no;  //121
	
	while(no>0){
		r=no%10; // 123%10 = 12.3 
		sum = (sum*10)+r; //0*10+3 =3 3*10+2=32 32*10+1 = 321
		no/=10;	
	}
	
	printf("\n Reverse no is %d",sum);
	if(f==sum){
		printf("\n It is palindrom no");
	} else {
		printf("\n It is not palindrom no");
	}
}
