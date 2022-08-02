import java.util.Scanner;

//	입력받은 수를 소인수분해 해서 그 결과를 각 줄에 3개씩 출력하기

public class Homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력 하십시오 : ");
		int su = sc.nextInt();
		int count =0;
		System.out.print(1+ "\t"); 
		count++; // 1카운트
		for(int i=2; i<su; i++) { // 2부터 su까지
			if(su % i == 0) {//su가 i에 나눠 지나?
				System.out.print(i + "\t"); 
					count++; //나눌 때 마다 카운트
						if(count % 3 ==0)
							System.out.println(); // 3카운트 때 마다 밑줄로
			}
		}
		System.out.println(su);
	}
}
