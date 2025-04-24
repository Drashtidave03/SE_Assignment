#include<iostream>
using namespace std;

main(){
	string s1[10];
	int n,e[10],h[10],s[10],total[10],i;
	
	cout<<"Enter number of student: ";
	cin>>n;
	
	for (i = 0; i < n; i++) {
        cout << "Enter name of Student " << i+1 << ": ";
        cin >> s1[i]; 
	}
	
	for (i = 0; i < n; i++) {
        cout<<"\nEnter English Marks of "<< s1[i] << ": ";
        cin >> e[i];
        cout<<"\nEnter Hindi Marks of "<< s1[i] << ": ";
        cin >> h[i];
        cout<<"\nEnter Sanskrit Marks of "<< s1[i] << ": ";
        cin >> s[i];
        
    }
    	for (i = 0; i < n; i++) {
		total[i] = e[i] + h[i] + s[i];
		cout<<"\nTotal Marks of "<< s1[i] <<" is "<< total[i];
	}
	
	for (i = 0; i < n; i++) {
		
	if(total[i]>=80)
	{
		cout<<"\n"<<s1[i]<<" A Grade";
	}
	else if(total[i]>=70)
	{
		cout<<"\n"<<s1[i]<<" B Grade";
	}
	else if(total[i]>=60)
	{
		cout<<"\n"<<s1[i]<<" C Grade";
	}else if(total[i]>=50)
	{
		cout<<"\n"<<s1[i]<<" D Grade";
	}
	else{
		cout<<"\n"<<s1[i]<<" is Fail.....Better luck next time ";
	}
}
}
