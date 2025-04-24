#include<iostream>
using namespace std;

class student{
		int id,total,a,b,c;
		char name[10];
		
		public:
		student(){
			cout<<"Enter Student Name"<<endl;
			cin>>name;
			cout<<"Enter Student Id"<<endl;
			cin>>id;
		}
	
		public:	
			void putdata(){
			cout<<"Name is "<<name<<endl;
			cout<<"Id is "<<id<<endl;
			a=15,b=20,c=5;
			total=a+b+c;
			cout<<"Total Marks is"<<total;
			}
	};

main(){
	student s1;
	s1.	putdata();
}
