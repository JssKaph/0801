
public class ArrayDemo9 {
	public static void main(String[] args) {
//		double [] original = {78.2, 56.9, 43.5};
//		double [] target = {172.8, 185.4, 162.9, 152.1};
//			
//		target[0] = original[1]; // 값 복사
//		target = original; // 주소 복사	
		
		// 정수(값) 스와핑
//		int original = 5;
//		int target = 9;
//		System.out.println("Before Swapping");
//		System.out.printf("original=%d, target=%d\n",original, target);
		
//		int temp = original; // 임시변수에 하나의 값을 넣고 시계 방향으로 스와핑
//		original = target;
//		target = temp;
//		System.out.println("After Swapping");
//		System.out.printf("original=%d, target=%d\n",original, target);
		
		// 주소  스와핑
//		Product pencil = new Product();
//		pencil.name = "연필";
//		pencil.price = 200;
//		pencil.color = "black";
//		
//		Product mouse = new Product();
//		mouse.name = "마우스";
//		mouse.price = 50000;
//		mouse.color = "Silver"; 
//		
//		// 값 스와핑과 주소 스와핑은 똑같이 해도 된다.
//		System.out.println("Before Swapping");
//		pencil.display();
//		mouse.display();
//		//스와핑
//		Product temp = pencil;
//		pencil = mouse;
//		mouse = temp;
//
//		System.out.println("After Swapping");
//		pencil.display();
//		mouse.display();
		
		// Bubble sorting : 제일 크거나(오름차순) 제일 작은애가(내림차순) 맨 끝으로 가서 정렬 된다.
		int [] original = {4, 6, 2, 4, 5, 2, 5, 2, 1, 6 ,8 ,9, 3, 2};
		System.out.println("Before Sorting");
		for (int su : original) {
			System.out.printf("%d\t", su);
		}
		for (int i=0; i<original.length-1; i++) { // 밑으로
			for(int j=0; j<original.length -1; j++) { // 옆으로 비교 -1은 맨 뒤에서 앞에것 까지만 하기 때문에
				if(original[j]>original[j+1]) { // (오름차순 이라면) 앞에가 클 때 교환
					int temp = original[j]; // 임시 변수에 앞에 값 저장
					original [j] = original [j+1]; // 앞에 값을 뒤에 값으로 덮어 씌우기
					original [j+1] = temp; // 뒤에 값에 앞에 값 저장
				}
			}
		}
		System.out.println();
		System.out.println("After Sorting");
		for (int su : original) {
			System.out.printf("%d\t", su);
		}
	}
}
