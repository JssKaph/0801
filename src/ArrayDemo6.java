import java.util.Scanner;

public class ArrayDemo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student jimin = new Student(); 
		
		System.out.print("Name? : ");
		jimin.name = sc.nextLine();	
		System.out.print("Hakbun? : ");
		jimin.hakbun = sc.nextLine();	
		System.out.print("Korean? : ");
		jimin.kor = sc.nextInt();	sc.nextLine();
		System.out.print("English? : ");
		jimin.eng = sc.nextInt();	sc.nextLine();
		System.out.print("Math? : ");
		jimin.mat = sc.nextInt();	
		
		jimin.calcTot();
		jimin.calcAvg();
		jimin.calcGrade();
		
		jimin.display();
	}// 두개의 class로 찢어서 코드를 짜는 이유는 협업하기 위해서, 유지 보수를 편하게 하기 위해서
}
