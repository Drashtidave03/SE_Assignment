#include<stdio.h>
main(){
	
	int a[50],i,j,n,b[50];
	
	printf("Enter size of array:");
	scanf("%d",&n);
	printf("Enter Element...");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
		j=0;
	    for (i = n - 1; i >= 0; i--,j++)
		{
	
			b[j]=a[i];
		
		}
		
	printf("\n Your reverse element are:");
	for(j=0;j<n;j++)
	{
		printf("%d",b[j]);
	}
}
