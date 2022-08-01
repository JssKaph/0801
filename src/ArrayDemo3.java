
public class ArrayDemo3 {
	public static void main(String[] args) {
		//배열의 초기값
		// 정수형 : 0으로 초기화
//		int [] array = new int[4];
//		for(int i=0; i<array.length; i++) {
//			System.out.print("array["+i+"]="+array[i]+"\t");
//		}
		
		//실수형 : 0.0으로 초기화
//		double [] array = new double[4];
//		for(int i=0; i<array.length; i++) {
//			System.out.print("array["+i+"]="+array[i]+"\t");
//		}
		
		//문자형 : null값, '\0', '\u0000' (출력이 안됨)
//		char [] array = new char[4];
//		for(int i=0; i<array.length; i++) {
//			System.out.print("array["+i+"]="+array[i]+"\t");
//		}
		
		//불린형 : false
//		boolean [] array = new boolean[4];
//		for(int i=0; i<array.length; i++) {
//			System.out.print("array["+i+"]="+array[i]+"\t");
//		}
		
		//참조형 : null번지, null
		String [] array = new String[4];
		for(int i=0; i<array.length; i++) { // 배열의 길이
			System.out.print("array["+i+"]="+array[i]+"\t");
		}
// 		5가지중 하나의 값으로 초기화가 된다.
	}
}
