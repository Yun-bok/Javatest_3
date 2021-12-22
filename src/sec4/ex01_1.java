package sec4;

public class ex01_1 {

	public static void main(String[] args) {
		int charCode = 'A';// 자동 타입변환
		
		//if(조건식) 조건식이 true -> 블록 실행, false 실행x
		if( (charCode>=65) & (charCode<=90)) {
			System.out.println("대문자 이군요");
		}
		
		if( (charCode>=97) && (charCode>57) ) {
			System.out.println("소문자 이군요");
		}
		//charCode>=48 && charCode<=57
		if(!(charCode<48) && !(charCode>57) ) {
			System.out.println("0~9 숫자 이군요");
		}
		int value = 6;
		
		if( (value%2==0)  |  (value%3==0)) {
			System.out.println("2 또는 3의 배수 이군요");
		}
		//if( (true둘다 맞게떨어짐) || (true))
		//if(true)
		if( (value%2==0) || (value%3==0) ) {
			System.out.println("2또는 3의 배수 이군요");
		}
		

	}

}
