#include<stdio.h>
main(){
	int f=0,s=1,t,i=1;
	while(i<=10){
		printf("%d\n",f);
		t=f+s;
		f=s;
		s=t;
		i++;	
	}
}
