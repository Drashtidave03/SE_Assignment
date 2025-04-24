#include<stdio.h>
main()
{
	int a[50],i,n,b[50];
	
	printf("Enter size of array:");
	scanf("%d",&n);
	printf("Enter Element...");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("\n Your original elemnt are:");
	for(i=0;i<n;i++)
	{
		printf("%d",a[i]);
	}
	
	
	for(i=0;i<n;i++)
	{
			b[i]=a[i];
	}
	
	printf("\n Your Copied elemnt are:");
	for(i=0;i<n;i++)
	{
		printf("%d",b[i]);
	}
}

// 
