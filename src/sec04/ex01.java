package sec04;

public class ex01 {
	public static void main(String[] args) {
		//이항 연산자
		//피연산자가 2개
		//산술, 문자열 연결, 대입 연산 , 비교 , 논리, 비트논리, 비트이동
		
		//산술 연산자 
		//사칙연산 및 나머지
		//곱셈*,나눗셈 /,나머지%
		//주의 : int를 나눗셈 연산하면 '몫'이 나온다.
		System.out.println("산술 연산자");
		float float_Val = 3f/2f;
		System.out.println(float_Val);
		int int_Val = 3/2;
		System.out.println(int_Val);
		
		double double_Val = 3/2;
		System.out.println(double_Val);
		double double_Val2 = 3/2d;
		double double_Val3 = 3/(double)2;
		System.out.println(double_Val2);
		System.out.println(double_Val3);
		
		//int int_Val2 = 3/0; //실행 에러 -> 산술예외(오류)
		
		//나머지
		//0~b보다 1적은 값까지
		System.out.println("나머지 예제");
		int a = 5 , b = 3;
		int c = a%b;
		System.out.println(c);
		
		//주의
		// -0, 0.0 으로 나누기나 나머지를 구하면 에러가 아님-> 필터링 필요
		//NaN : Not a Number  3%0.0
		//Infinity            3/0.0
		
		System.out.println(1%0.0);
		System.out.println(1/0.0);
		
		//문자열 연산자(+)
		//문자열 결합
		System.out.println("문자열 연산자");
		String str = "문자열" + "이어붙이기+숫자"+6+"실수"+6.0+'a';
		//문자열이어붙이기+숫자6실수6.0a
		System.out.println(str);
		
		//비교 연산자 (==,!=, <,>,<=,>=)
		System.out.println("비교 연산자");
		boolean b_Val = 3==4;
		System.out.println("b_Val");
		int i_Val = 3;
		boolean b_Val2 = i_Val!=4;
		System.out.println(b_Val2);
		boolean b_Val3 = "강사는" =="그렇다";
		boolean b_Val4 = "일치" =="일치";
		System.out.println(b_Val3);
		System.out.println(b_Val4);
		
		//논리 연산자(&&,||,^,!,&,|)
		//피연산자가 boolean타입
		//AND(논리곱)&&, OR(논리합)||, XOR(베타적 논리합), NOT(논리부정) !
		//AND는 둘다 참 -> 참 , OR는 둘중 하나이상 참->참
		//XOR은 둘중 하나만 참->참, NOT는 반전
		//&& 두개쓰면 앞의 피연산자가 false면 뒤의 연산을 하지않음,
		//& 한개는 무조건 둘다 연산을 함
		System.out.println("논리연산자");
		
		
		//비트 연산자
		//비트 논리 연산자(&,|,^,~)와 비트 이동 연산자(<<,>>,>>>)
		
		//비트 논리 연산자(&,|,^,~)
		//피연산자가 정수타입
		//일반 논리연산자와 비슷한 개념, true, false 대신 1과 0으로
		System.out.println("비트 논리 연산자");
		int i_val1 = 45;
		int i_val2 = 25;
		int r_result = i_val1 & i_val2;
		
		String binaryString1 = Integer.toBinaryString(i_val1);
		System.out.println(binaryString1);
		//101101
		String binaryString2 = Integer.toBinaryString(i_val2);
		System.out.println(binaryString2);
		//011001
		
		//i_val1 = 101101
		//i_val2 = 011001
		//         001001 -> 9
		System.out.println(r_result);
		
		int r_result2 = i_val1 | i_val2;
		//i_val1 = 101101
		//i_val2 = 010010
		// 		   111111 -> 32+16+8+4+1 ->61
		System.out.println(r_result2);
		
		//비트 이동 연산자(<<,>>,>>>)
		//좌측이동<<
		//좌변의 각 비트를 우변만큼 왼쪽으로 이동, 빈자리는 0
		System.out.println("비트 이동 연산자");
		int result = 2<<2;
		//00000010
		//00001000 -> 8
		System.out.println(result);
		int result2 = 2<<34; // ? int 32bit <<32 자기자리
		System.out.println(result2);
		
		//우측 이동>>
		//좌변의 각 비트를 우변만큼 오른쪽으로 이동, 빈자리는 최상위부로 비트값
		int result3 = -8>>1;
		//1.음수 2진수로 만들기
		//00001000 ->8의 2진수
		//2.~연산 -> 반전시키는거
		//11110111
		//3.+1
		//11111100 -> -8 2진수
		//11111100 -> 음수 2진수 -> 십진수
		//1.2.3. 역순으로 2진수 ->부호는 - 붙여줘요 
		//ㄱ. -1
		//11111100 -> 11111011
		//ㄴ.~연산 -> 반전
		//00000100 ->
		//ㄷ. 부호
		//-4
		
		System.out.println(result3);
		
		//우측 이동 >>>
		//좌변의 각비트를 우변만큼 오른쪽으로이동, 빈자리를 0으로 채움
		int result4 = -8>>>1;
		//11111000
		// 11111000
		//01111100
		
		//00000000 00000000 00000000 0000100 ->	
		//반전
		//11111111 11111111 11111111 11110111
		//+1
		//11111111 11111111 11111111 11111000
		// 11111111 11111111 11111111 11111000
		//011111111 11111111 11111111 1111100 -> 정수
		System.out.println(result4);
		
		//대입 연산자
		//단순 대입 = 
		//복합 대입 연산자
		//좌측 변수의 값과 우측 변수의 값으로 (연산자)=앞에 연산을  실행한 후
		//좌측 변수에 저장
		//+=,-=,*=,/=,&=
		System.out.println("대입 연산자");
		int test = 5;
		test *= 5;// 우측값을 좌측값에 곱해서 넣어준다
		System.out.println(test);
		
	}

}
