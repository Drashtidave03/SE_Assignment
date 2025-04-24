#include<stdio.h>
main()
{
	int a[50],i,n,max,min;
	
	printf("Enter size of array:");
	scanf("%d",&n);
	printf("Enter Element...");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	max=a[0];
	min=a[0];
	
	for(i=0;i<n;i++)
		if(a[i]>max){
			max=a[i];
		}
		if(a[i]<min){
			min=a[i];
		}
		
	printf("/n max is %d",max);
	printf("/n min is %d",min);
}
