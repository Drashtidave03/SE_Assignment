#include<stdio.h>
main()
{
	int a[50],i,n,sum=0;
	
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
		sum = sum + a[i];
		printf("%d \n",a[i]);
	}
	printf("\n sum of element are %d",sum);
}


//sum of elemnrt 
// multiply of elemrnt
// only print even or odd number
// max value
