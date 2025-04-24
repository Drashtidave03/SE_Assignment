/*#include<stdio.h>
main(){
	int i,j;
	for(i=1;i<=5;i++){
		for(j=1;j<=5;j++){
			printf("*");
		}
		printf("\n");
		
	}
}*/

#include<stdio.h>
main(){
	int i,j;
	for(i=1;i<=5;i++){
		for(j=1;j<=i;j++){
				printf("*");
		}
		printf("\n");
		
	}
}


/*#include<stdio.h>
main(){
	int i,j;
	for(i=1;i<=5;i++){
		for(j=1;j<=5;j++){
			if(i+j>=6)
				printf("*");
			else
				printf(" ");
		}
		printf("\n");
		
	}
}



#include<stdio.h>
main(){
	int i,j,k=1;
	for(i=1;i<=5;i++){
		for(j=1;j<=i;j++){
			if(j<=i){
				printf("%d ",k++);
			}
				
		}
		printf("\n");
		
	}
}*/
