#include<iostream>

class fibo{
	int f=0,s=1,t,i;
	public:
	void fiboSeries(){
		for(i=1;i<=10;i++)
		{
			t=f+s;
			f=s;
			s=t;
			std::cout<<"\n"<<t;
		}
	}
};
main(){
	fibo f1;
	f1.fiboSeries();
}
