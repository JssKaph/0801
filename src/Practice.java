import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("초를 입력해 주십시오 : ");
			int second = sc.nextInt();
			
			int sec = second%3600;
			int hour = second/3600; // 시
			int minute = sec/60; //분
			sec = sec%60; //초
			System.out.printf("%d초는 %d시간 %d분 %d초입니다.", second, hour, minute, sec);
			//틀림 강사님 깃허브 참고
	}
}
