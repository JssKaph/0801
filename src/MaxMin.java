import java.util.Scanner;

//최대공약수 최소공배수

public class MaxMin {
	public static void main(String[] args) {
		int gcm=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫째 수를 입력 하세요 : ");
		int su1 = sc.nextInt(); sc.nextLine();
		System.out.print("둘째 수를 입력 하세요 : ");
		int su2 = sc.nextInt();
		for (int i=2; i<su1; i++) {//무한루프 방지
			if(su1 % i == 0 && su2 % i == 0) //su1을 i로 나눴는데 나눠지고 su2도 i로 나눠지나? (큰수로 계속 덮어 씌워짐)
				gcm = i; // 최대공약수
		}
		int lcm = (su1/gcm)*(su2/gcm)*gcm; // 최소공배수
		System.out.println("<입력>");
		System.out.printf("첫째 수 : %d\n둘째 수 : %d\n",su1,su2);
		System.out.println("<출력>");
		System.out.printf("%d와 %d의 GCM = %d LCM = %d",su1,su2,gcm,lcm);
	}
}
