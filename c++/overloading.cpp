#include<iostream>
using namespace std;
#define pi 3.14

void area(float r){
	cout<<"Enter R :";
	cin>>r;
	cout<<"\nArea of circle is "<<pi*r*r;
}

void area(int l,int h){
	cout<<"Enter L and H :";
	cin>>l<<h;
	cout<<"\nArea of Rectangle is "<<l*h;
}

void area(int l,int h,int b){
	cout<<"\nArea of Triangle is "<<l*b*h;
}

main(){
	area(15);
	area(2,5);
	area(2,5,7);
}
