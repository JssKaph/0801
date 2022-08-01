
public class ArrayDemo {
	public static void main(String[] args) {
//		첫번째 방법, 변수가 늘어나면 선언하기가 어렵다
//		int [] array; // 배열 선언 (주소 변수, 값이 아님)
//		array = new int[4]; // 배열의 생성
//		array[0] = 6; // ex1000
//		array[1] = 9; // ex1004 한칸에 4바이트 (int)
//		array[2] = 12;
//		array[3] = 15; // 할당
//
//		for(int i=0; i<4; i++) {
//			System.out.print("array["+i+"]="+array[i]+"\t");
//		}
		
//		두번째 방법
//		double [] weights; // 배열 선언
//		weights = new double [] {67.3, 78.9, 52.3}; // 생성 및 할당
//		for(int i=0; i<3; i++) {
//			System.out.printf("weights[%d] = %.1f\t",i, weights[i]); // 더블 사이즈는 한칸에 8바이트
//		}

//		세번째 방법
		char [] grades = {'A', 'C', 'B', 'B', 'C'}; // 초기화
		int i = 0;
		while(i<5) {
			System.out.print("grades["+i+"]="+grades[i]+"\t");
			i++;
		}
	}
}
