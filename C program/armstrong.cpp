#include<stdio.h>
//153 = 1^3  5^3  3^3 == 1+125+27=153
//123 == 1 2 3 ==1+8+27 == 36
main(){
	int no,r,sum=0,f;
	printf("Enter no:");
	scanf("%d",&no);
	f=no;  //153
	while(no>0){
		r=no%10;
		sum = sum +(r*r*r);
		no/=10;
	} //no =0
	printf("\n Armstrong no is %d",sum);
	if(f == sum){
		printf("\n It is armstrong no..");
	} else {
		printf("\n It is not armstrong no..");
	}
}
