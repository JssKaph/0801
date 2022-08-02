//1부터 100까지의 소수를 출력하기

public class Homework2 {
	public static void main(String[] args) {
		boolean flag = true; // 소수인지 아닌지 처리하기 위해 불린 사용
		int i,j, count=0;
		for (i=2; i<101; i++) { // 1부터 100까지 범위 for문
			for (j=2; j<=i; j++) { // 소수 인지 판별하는 for문
				if (i % j ==0) { 
					flag = false;
					break; //하나는 break, 하나는 거짓
				}
			}
			flag = true; // i가 j로 나누어 지면 오는 루프
			if(flag && i == j) {
				System.out.printf("%d\t", i);
					count++;
					if(count % 5 == 0) //5줄마다 넘기기
						System.out.println();
			}
		}
	}
}
