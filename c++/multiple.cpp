#include<iostream>
using namespace std;

class A{
	
	public:
	A(){
	cout<<"\nA is called";
	}
	void add(int a,int b){
		cout<<"\nAddition is "<<a+b;
	}
};

class B{
	
	public:
	B(){
	cout<<"\nB is called";
	}
	void sub(int a,int b){
		cout<<"\nSubstraction is "<<a-b;
	}
};

class C : protected A,B{
	public:
	C()
	{
	cout<<"\nC is called";
	}
	void dis(int a,int b){
		add(a,b);
		sub(a,b);
	}
};

main(){
	C c1;
	c1.	dis(100,50);
}
