#include<stdio.h>
main(){
	int a[50],*p,i,n,sum=0,mul=1;
	p=a;
	
	printf("Enter Array: ");
	scanf("%d",&n);
	
	printf("Enter Element...");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++)
	{
		sum = sum + p[i];
		mul = mul*p[i];
	}
	printf("Addition of array is %d",sum);
	printf("\nMultiply of array is %d",mul);
}
