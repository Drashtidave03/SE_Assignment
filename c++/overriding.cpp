#include<iostream>
using namespace std;
#define pi 3.14

class A{
	public:
void dis(){
	cout<<"\nHello 1st";
}
};

class B : public A{
		public:
void dis(){
	cout<<"\nHello 2st";
}
};

class C : public A{
		public:
void dis(){
	cout<<"\nHello 3st";
}
};

main(){
	C c1;
	c1.dis();
}
