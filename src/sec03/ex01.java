package sec03;

public class ex01 {
	public static void main(String[] args) {
		//[단항 연산자]
		//피연산자(리터럴,변수)가 1개인 연산자
		//부호(+,-) , 증감(++,--), 논리 부정(!), 비트 반전(~)
		
		//부호 연산자(+,-)
		//양수, 음수 표시할때 사용
		//부호 반전할때도 사용
		System.out.println("부호 연산자");
		int num = +10;
		int num2 = +num;
		int num3 = -num;
		//번외 
		int num4 = num*(-1);
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		//컴파일에러
		//연산의 결과값은 int 타입으로 반환
		// 주의 short x = -(-100L); L = long 타입 연산하면 int로 나오지만 long이 크기에 자동변환된다
		// int x2 = -(-100L);
		
		
		//증감 연산자(++,--)
		//변수의 값을 1증가(++) or 1감소(--)
		//변수 앞에 있으면 다른 연산자보다 먼저
		//변수 뒤에있으면  다른 연산자보다 나중에 작업됨
		
		System.out.println("증감연산자");
		int x = 3, y = 5;
		int temp = x++;
		System.out.println(temp);
		System.out.println(x);
		int temp2 = ++x;
		System.out.println(temp2);
		System.out.println(x);
		//연산식 전에서 이뤄지는지 후에서 이뤄지는지가 중요
		//temp로인해 x는 3->4가 되고 이후 연산으로 5가 출력되게된다 흐름보기
		//x는 4가 되있지만 출력을 temp로 했기에 연산자가 변수뒤에가있어서 3이나온다
		
		
		//이클립스가 업데이트 될수록 실수될수있을걸 막아줌
		//퀴즈 result의 값은?
		x=3; y=2;
		int result = ++x + y--;
		//4+2
		//result 6  x=4 , y=1
		
		//퀴즈 result의 값은?
		x=3; y=2;
		int result2 = --x + x++ + y-- + --y;
		//result2= 2+2+2+1 사실 뒤에 y는 0이된다
		//x=4, y=0
		// x++,y--든 피연산자가되고 순서상 y는0이된다
		
		
		System.out.println(result2);
		//퀴즈 result3의 값은?
		x=5; y=6;
		int result3 = ++x + y-- - x++ + --y;
		//result3 = 6 + 6 - 6 + 4 =10
		//x=7 , y=4
		System.out.println(result3);
		
		//논리부정 연산자 (!)
		//true -> false, false -> true 반전
		System.out.println("논리 부정 연산자");
		boolean boolean_Val = false;
		boolean temp_boolean = !boolean_Val;
		System.out.println(boolean_Val); //false
		System.out.println(!boolean_Val);//true
		System.out.println(temp_boolean);//true
		System.out.println(!temp_boolean);//false
		System.out.println(!(!temp_boolean));//true
		
		//비트 반전 연산자(~)
		//정수 타입 피연산자(변수,리터럴)에 사용
		System.out.println("비트 반전 연산자");
		byte test = 126;
		String binartString3 = Integer.toBinaryString(test);
		System.out.println(binartString3); //01111110
		int int_temp = ~test; //126 -> 이진수로 바꾸면 //01111110
		//01111110
		//10000001
		//최상위 부호가 1이면
		//10000001 -1
		//10000000 반전
		//01111111 ->127인데 최상위 부호가 1이었으니까 -가붙어서 -127
		System.out.println(int_temp);
		String binartString4 = Integer.toBinaryString(int_temp);
		System.out.println(binartString4);
		//뒤에 8자리 때면 10000001
		
		byte test2 =32;
		//00100000
		int int_temp2 = ~test2;
		//11011111
		//(첫번째) 최상위부로 1이니 -1하고 반전시킨 결과의 -부호 추가 1'byte'니까 8자리
		//11011110
		//00100001 뒤에1더있으니까 33 -> -33 뒤에서부터 1 2승으로 1 2 4 8 16순
		System.out.println(int_temp2);
		
		
	}
}
