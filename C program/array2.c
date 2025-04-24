#include<stdio.h>
main()
{
	int a[50],i,n;
	
	printf("Enter size of array:");
	scanf("%d",&n);
	
	printf("Enter Elements:");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	
	printf("\n Your Element are:");
	for(i=0;i<n;i++)
	{
		printf("%d",a[i]);
	}
}
