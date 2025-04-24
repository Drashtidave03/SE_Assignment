#include<stdio.h>
main(){
	
	int a[50],i,j,n,b[50],c[50],m,total;
	
	printf("Enter size of A array:");
	scanf("%d",&n);
	printf("Enter Element...");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	
	printf("Enter size of  B array:");
	scanf("%d",&n);
	printf("Enter Element...");
	for(i=0;i<n;i++)
	{
		scanf("%d",&b[i]);
	}
	for(i=0;i<n;i++)
	{
			c[j]=a[i];
	}
	total=m+n
	for(i=m;i<total;i++)
	{
		c[j]=b[i];
	}
	printf("\n Your merge element are:");
	for(j=0;j<n;j++)
	{
		printf("%d",c[j]);
	}
}

