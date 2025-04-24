#include<stdio.h>
main()
{
	int f=0,s=1,t,i;
	
	/*for(i=0; i<10; i++)	{
		printf("%d\n",f);
		t=f+s;
		f=s;
		s=t;
	}*/
	
	do{
		printf("%d\n",f);
		t=f+s;
		f=s;
		s=t;
		i++;
	}
	while(i<=10);
}
