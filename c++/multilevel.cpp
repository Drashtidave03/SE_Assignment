#include<iostream>
using namespace std;

class A{
	cout<<"A is called";
};

class B : protected A{
	cout<<"B is called";
	
};

class C : protected B{
	cout<<"c is called";
	
};

main(){
	
	
}
