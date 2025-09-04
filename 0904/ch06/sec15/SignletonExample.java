package ch06.sec15;

public class SignletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Signleton obj1= new Signleton(); 
		Signleton obj2 = new Signleton();
		 */
		
		Signleton obj1 = Signleton.getInstance();
		Signleton obj2 = Signleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Signleton 객체 입니다.");
		}else {
			System.out.println("다른 Signleton 객체 입니다.");
		}
	}

}
