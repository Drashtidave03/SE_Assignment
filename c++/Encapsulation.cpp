#include <iostream>
using namespace std;

class Rectangle {
  public:
    int length;
    int breadth;

    int getArea(int length,int breadth) {
      int ans = length * breadth;
      cout<<"Area "<<ans;
    }
};
main(){
	Rectangle r1;
	r1->getArea(5,2);
//	r1.length = 5;
//	r1.breadth = 4;
//	cout<<"area :"<<r1.getArea();
}
