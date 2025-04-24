#include<iostream>
using namespace std;

class dashu{
	int p,q; // class member variable
	
	public:
	dashu(){
		cout<<"Default constructor";
	}
	dashu(int a,int b){
		p=a;
		q=b;
	}
	dashu(const dashu &dj){
		p=dj.p;
		q=dj.q;
	}
	void disp(){ //class function
		
		cout<<"\nP is "<<p;
		cout<<"\nQ is "<<q;
		cout<<"\nAddition of p & q is"<<p+q;
	}	
};

main(){
	dashu d1;
	dashu d2(20,25);
	dashu d3(d2);
	d3.disp();
}
