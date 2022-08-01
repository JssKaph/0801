
public class Practice4 {
	public static void main(String[] args) {
		
 		//내가 만든 코드
		int sum = 0;
		double avg = 0;
		int [] array = {10,50,44,56,29,30,9,48,84,92};
		System.out.print("배열 원본 = ");
		for (int su : array) {
			sum += su; // 합계
			avg = sum/10.; // 평균
			System.out.printf("%d\t", su); //배열 원본
		}
		System.out.println();
		System.out.print("합계 = ");
		System.out.printf("%d",sum);
		System.out.println();
		System.out.print("평균 = ");
		System.out.printf("%.1f",avg);
		
		//오름 차순
		for (int i=0; i<array.length - 1; i++) { // 밑으로
			for(int j=0; j<array.length -1; j++) { // 옆으로 비교 -1은 맨 뒤에서 앞에것 까지만 하기 때문에
				if(array[j]>array[j+1]) { // (오름차순 이라면) 앞에가 클 때 교환
					int temp = array[j]; // 임시 변수에 앞에 값 저장
					array [j] = array [j+1]; // 앞에 값을 뒤에 값으로 덮어 씌우기
					array [j+1] = temp; // 뒤에 값에 앞에 값 저장
				}
			}
		}
		System.out.println();
		System.out.printf("오름 차순 = ");
		for (int su : array) {
			System.out.printf("%d\t", su);
		}
		//내림 차순
		for (int i=0; i<array.length - 1; i++) { 
			for(int j=0; j<array.length -1; j++) {  
				if(array[j]<array[j+1]) { 
					int temp = array[j]; // 임시 변수에 앞에 값 저장
					array [j] = array [j+1]; // 앞에 값을 뒤에 값으로 덮어 씌우기
					array [j+1] = temp; // 뒤에 값에 앞에 값 저장
				}
			}
		}
		System.out.println();
		System.out.printf("내림 차순 = ");
		for (int su : array) {
			System.out.printf("%d\t", su);
		}
		//	입력받은 수를 소인수분해 해서 그 결과를 각 줄에 3개씩 출력하기
		//	1부터 100까지 소수를 출력하기
	}
}

