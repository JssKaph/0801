import java.util.Scanner;

public class ArrayDemo8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("제품 몇 개 ? : ");
		int count = sc.nextInt();
		sc.nextLine();
		Product [] array = new Product[count]; //배열 갯수 저장
		
		for(Product p: array) { // 오른쪽은 배열, 왼쪽은 제품 변수
			p = new Product();	// 생성
			System.out.print("Name : ");
			p.name = sc.nextLine();
			System.out.print("Price : ");
			p.price = sc.nextInt();
			sc.nextLine();
			System.out.print("Color : ");
			p.color = sc.nextLine();
			p.display();
		}	
	}
}
