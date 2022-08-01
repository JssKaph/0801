
public class Student {
	String name, hakbun; // 멤버변수(instance Variable) or class Variable(static 이 붙으면)
	int kor, eng, mat, tot, age;
	double avg;
	char grade;
	
	void calcTot(){  //void 보내기만 하고 아무것도 가져오지 않는 것
		tot = kor+eng+mat;
	}
	void calcAvg(){ // 멤버변수(instance Variable), 주소로 접근
		avg = tot/3.0;
	}
	void calcGrade(){
		grade = (avg<=100 && avg >=90) ? 'A' : // 평균이 100보다 작거나 90 이상 이라면
			(avg <=90) ? 'B' :
				(avg <=80)? 'C' :
					(avg <=70)? 'D' : 'F';
	}
	void display() {
		System.out.printf("%s(%s)\t%d\t%d\t%d\t%d\t%.2f\t%c\n",
				name, hakbun, kor, eng, mat, tot, avg, grade);
	}
}
