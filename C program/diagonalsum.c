#include<stdio.h>
main(){
	int a[10][10],m,n,i,j,k,sum=0,sum2=0;
	
	printf("Enter size of rows : ");
	scanf("%d",&m);
	printf("Enter size of colume : ");
	scanf("%d",&n);
	
	printf("\n Enter Element...");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
		scanf("%d",&a[i][j]);
		}
	}
	
	printf("\n Matrix is : \n ");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
		printf("%d ",a[i][j]);
		}
		printf(" \n ");
	}
	{
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			if (i == j){
			sum=sum+a[i][j];
			k=i+j;
		}
		}
		printf(" \n ");
	}
	}
	printf("Sum of Diagnolan rows are: %d",sum);
	
	/*for(i=0;i<m;i++)
	{
		for(j=0;j<n;j--)
		{
			if (i != j){
			sum2=sum2+a[i][j];
		}
		}
		printf(" \n ");
	}
	printf("Sum of Diagnolan rows are: %d",sum2);
	*/
	
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			if(k % 2 == 0){
			sum2=sum2+a[i][j];
		}
		}
		printf(" \n ");
	}
	printf("Sum of Diagnolan rows are: %d",sum2);
}

