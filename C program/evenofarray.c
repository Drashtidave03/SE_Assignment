#include<stdio.h>
main()
{
	int a[50],i,n;
	
	printf("Enter size of array:");
	scanf("%d",&n);
	
	printf("\n Enter Elements:");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	
	printf("Your Odd number are: \n");
	for(i=0;i<n;i++)
	{
		if(a[i]%2 == 0)
		{
		printf("%d \n",a[i]);
		}
	}
	printf("\nYour Even number are: \n");
	for(i=0;i<n;i++)
	{
		if(a[i]%2 != 0)
		{
		printf("%d \n",a[i]);
		}
	}
}
