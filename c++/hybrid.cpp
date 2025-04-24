#include<iostream>
using namespace std;

class A{
	public:
	void dis()
	{
		cout<<"\nA is called";
	}
};

class B : public A{
	public:
	virtual void dis()
	{
		cout<<"\nB is called";
	}
};

class C : public A{
	public:
	virtual void dis()
	{
		cout<<"\nC is called";
	}
};
class D : public B,C{
	public:
	virtual void dis()
	{
		cout<<"\nD is called";
	}	
};

main()
{
	D d1;
	d1.dis();
	A a1;
	a1.dis();
}
