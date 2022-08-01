
public class Product { // 맴버 변수, 인스턴스 변수
	String name;
	int price;
	String color;
	
	void display() { // 멤버 메소드(주소로 접근)
		System.out.printf("이름=%s, 가격=%d, 색상=%s\n", name, price, color);
	}
}
// 멤버 변수와 멤버 메소드는 반드시 주소로 접근하다.
// 주소는 new 할 때 생긴다.