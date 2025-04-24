#include<iostream>
using namespace std;

class emp{
		int emp_id;
		char name[10];	
	
		public:
			void getdata(){
				cout<<"Name is "<<name<<endl;
				cout<<"ID is "<<emp_id;
			}
		public:
			void putdata(){
				cout<<"Enter ID :";
				cin>>emp_id;
				cout<<"Enter Name :";
				cin>>name;
			}
};

main(){
	emp e1;
	e1.putdata();
	e1.getdata();
}
