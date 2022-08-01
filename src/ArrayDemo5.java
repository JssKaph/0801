
public class ArrayDemo5 {
	public static void main(String[] args) {
		int [] array = {4,5,8,1,3};
//		for(int i =0; i<array.length; i++) {
//			System.out.print("array["+i+ "]=" +array[i]+"\t");
//		}
		
		// 새로운 for문은 배열과 컬렉션에서 사용함
		// index가 없다 (처음부터 끝까지) i 번째라는 번호가 필요없을때 
		// 1부터 100까지 더하는 배열같은것은 사용 할 수 없다.
		for(int su : array) { // :을 기준으로 좌, 우 (오른쪽은 반복을 하기 위한 대상 array, 왼쪽은 변수)
			System.out.println(su); 
		}
		
	}
}
