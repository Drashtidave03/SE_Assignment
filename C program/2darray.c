#include<stdio.h>
main(){
	
	int a[3][3]={{1,2,3},{4,5,6},{7,8,9}},i,j;
	
	for(i=0;i<3;i++){
		for(j=0;j<3;j++)
		{
			printf("%d ",a[i][j]);
		}
		printf("\n");
	}
	
	
	
//	printf("%d\n",a[0][0]);
//	printf("%d\n",a[1][2]);
//	printf("%d\n",a[2][2]);
}
