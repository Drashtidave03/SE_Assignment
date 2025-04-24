#include<iostream>
using namespace std;

class dashu{
	
	private:
	int a,cube;
	
	friend int display(dashu);
	
	public:
		dashu() : a(5) {}
};
int display(dashu d)
{
	d.a=d.a*3;
	d.cube=d.a*3;
	return d.a;
}
main(){
	dashu d1;
	cout<<"cube is "<<display(d1);
}

