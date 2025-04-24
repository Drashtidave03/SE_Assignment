#include<iostream>
using namespace std;

main(){
	int age,a,b;
	
	cout<<"Enter age:";
	cin>>age;
	
	if(age>=18){
		cout<<"Eligible";
	}else{
		cout<<"Not Eligible";
	}
	
	cout<<"\nEnter a:";
	cin>>a;
	cout<<"\nEnter b:";
	cin>>b;
	
	if(a>b){
		cout<<"\nA is max";
	}else{
		cout<<"\nB is max";
	}
}

