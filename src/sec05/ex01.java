package sec05;

public class ex01 {

	public static void main(String[] args) {
		//삼항 연산자 
		//세개의 피연산자
		//조건식 ? A(값 or 연산식) : B(값 or 연산식)
		//조건식이 참(true)이면 A값, 거짓(false) B값을 받는것것
		int hour = 16;
		String result = (hour>=18)?"퇴근":"업무중";
		System.out.println(result);
		
		if(hour>=18) {
			result = "퇴근";
		}
		else {
			result = "업무중";
		}
		System.out.println(result);

	}

}
