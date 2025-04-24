#include<iostream>
using namespace std;

class dashu{
	public:
	int p,q;
	public:
	dashu(){
		cout<<"Default Called....";
	}
};

class jayu : public dashu {
	public:
	jayu(){
		cout<<"\nchild class calle";
	}
	jayu(int a,int b)
	{
		p=a;
		q=b;
		cout<<"Addition is "<<p+q;
	}
};

main(){
	jayu j1;
	jayu j2(10,15);
}
