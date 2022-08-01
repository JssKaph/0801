import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값을 입력해 주세요 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		int [] array = {50000,10000,5000,1000,500,100,50,10,5,1};
		for (int i=0; i<array.length; i++) {
			int mok = price / array[i]; // 몫
			int na = price % array[i]; // 나머지
			System.out.println(array[i] + "원권 : " + mok);
			price = na; // price 변수에 나머지를 계속 주입
		}
	}
}
