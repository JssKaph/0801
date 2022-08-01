import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
//		int array[] = new int[4];
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i=0; i<4; i++) {
//			System.out.print(i+"번째 방의 값 : ");
//			array[i] = sc.nextInt();
//		}
//		for(int i =0; i<4; i++) {
//			System.out.printf("array[%d] = %d\t",i, array[i]);
//		}
		
		Student [] array = new Student[2];
		for (int i=0; i<2; i++) {
			System.out.printf("array["+i+"]="+array[i]+"\t"); // 주소값의 초기값은 null 이다.
		}		
		array[0] = new Student(); // 학생의 클래스를 넣는다.
		array[1] = new Student();		
		System.out.println();
//		for (int i=0; i<2; i++) {
//			System.out.printf("array["+i+"]="+array[i]+"\t"); // Student 클래스의 주소값이 나온다.
//		}		
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<2; i++) { // 주소 값 지정
			System.out.print(i+"번째 학생의 이름 :");
			array[i].name = sc.nextLine();
			System.out.print(i+"번째 학생의 나이 :");
			array[i].age = sc.nextInt();
			sc.nextLine();
		}
		for (int i=0; i<2; i++) { // 출력
			System.out.print("array["+ i +"]의 이름 : "+array[i].name +"\t");
			System.out.println("array["+ i +"]의 나이 : "+array[i].age +"\t");
		}
	}
}
