package java0901;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v1 = 15;
		int v2;
		if(v1>10) 
			v2 = v1 - 10;
		else
			v2 = 10;
		int v3 = v1 + v2 + 5;
		
		int value = 123;
		System.out.printf("상품의 가격 : %d원\n", value);
		System.out.printf("상품의 가격 : %6d원\n", value);
		System.out.printf("상품의 가격 : %-6d원\n", value);
		System.out.printf("상품의 가격 : %06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 20, area);
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n",1, name, job);
		
	}

}
