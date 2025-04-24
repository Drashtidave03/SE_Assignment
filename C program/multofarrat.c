#include<stdio.h>
main()
{
	int a[50],i,n,m=1;
	
	printf("Enter size of array:");
	scanf("%d",&n);
	
	printf("\n Enter Elements:");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	
	printf("Your Element are: \n");
	for(i=0;i<n;i++)
	{
		m *=a[i];
		printf("%d \n",a[i]);
	}
	printf("\n sum of element are %d",m);
}
