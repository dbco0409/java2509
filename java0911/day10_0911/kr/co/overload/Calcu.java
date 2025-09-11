package kr.co.overload;

public class Calcu {
	
	//계산기 메인 역할
	public Calcu() {
		Calculator calc1 = new Calculator();
		Calculator calc2 = new Calculator();
		
		// 리턴 값이 있는 메소드 수행
//		calc1.add(5, 3);
//		
//		// 리턴 값이 없는 메소드 수행
//		int result2 = calc2.add2(7, 8);
		
		int result1 = calc1.add(5, 3);
		double result2 = calc2.add(2.2, 3.3);
		int result3 = calc2.add(5,  3, 2);
		
		//System.out.println(result1);
		//System.out.println(result2);
		
		//calc1.cnt = 99;
		//Calculator.cnt = 99;
		int resultCnt = Calculator.getCnt();
		System.out.println(resultCnt);
		//Calculator.total = 1000;
		
		Calculator.initCnt();
		//System.out.println(Calculator.initCnt());
	}
}
