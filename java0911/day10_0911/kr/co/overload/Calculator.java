package kr.co.overload;

public class Calculator {
	///int cnt;
	static int cnt = 0;
	// 반드시 클래스를 통해서 접근해야 한다.
	//static int total;
	
	public static int getCnt() {
		return cnt;
	}
	
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	public double add(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	public int add(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		return num1 + num2 + num3;
	}

	public static void initCnt() {
		// TODO Auto-generated method stub
		
	}



	

}
