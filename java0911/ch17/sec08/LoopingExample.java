package ch17.sec08;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		// 1. 잘못 작성한 경우
		Arrays.stream(intArr).filter(a -> a%2 == 0).peek(n->System.out.println(n));
		// 최종처리가 없으므로 동작 하지 않음.
		
		// 2. 중간 처리 메소드 peek()을 이용해서 반복 처리
		int total = Arrays.stream(intArr)
				.filter(a -> a%2 == 0)
				.peek(n->System.out.println(n))
				.sum();
		System.out.println("총합 :"+total);
		
		// 3. 최종 처리 메소드
		Arrays.stream(intArr)
		.filter(a -> a%2 == 0).forEach(n->System.out.println(n));
	}

}
