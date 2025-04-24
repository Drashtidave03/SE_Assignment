//menu driven program
#include<stdio.h>
main(){
	
	int a,b,ch;
	do {		
		printf("1.Addition \n2.Minus \n3.Exit");
		printf("\nEnter your choice:");
		scanf("%d",&ch);
		printf("Enter a & b:");
		scanf("%d %d",&a,&b);
		switch(ch){
			case 1: printf("\n Addition is %d",a+b);
					break;
			case 2: printf("\n Minus is %d",a-b);
					break;
			case 3: break;
			default: printf("\n Invalid choice..");
					 break;
		}
	} while(ch!=3);
	
}
