import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println(Add(num1,num2));
		System.out.println(Sub(num1,num2));
		System.out.println(Mul(num1,num2));
		System.out.println(Div(num1,num2));
		System.out.println(Bigger(num1,num2));
		//Add
		int num3 = input.nextInt();
		System.out.println(Bigger(num1,num2m,num3));
		
		//for ( 1. 초기값 ; 2. 조건식 ; 4. 증감식) {
		//    3.반복될 코드
		//}
		//1.초기값 -> 어떤 변수가 어떠한 값을 가짐
		//2.조건식 -> 참이면 안에 코드를 반복하고, 거짓이면 끝
		//3.반복될 코드를 실행
		//4.증감식 -> 값을 바꿔서 반복을 끝낼 조건을 찾게 만드는것
		//      초기값++ 초기값--  초기값=초기값+2
		//2 조건식 체크 -> 끝내도 되는지
		//3 4 2 3 4
		
		 for (int i = 0; i < 5; i++) {
			 if(i==2) {
				 break; //continue;
				 //System.out.println("*");
			 }
		 }
		
		{
			
		
		
		int Sub(int a , int b) {
			return a-b;
		}
		
		int Mul(int a , int b) {
			return a*b;
		}

		int Div(int a , int b) {
			if(b==0) {
				return 0;
			}
			return a/b;
	}
		
		int Bigger(int a, int b) {
			int result (a>=b)?a:b;
			return result;
		}
		
		int Bigger(int a, int b, int c) {
			int max = (a>=b)?a:b;
			max = (max>=c)?max:c;
					return 0;
		}



		
		
		
		
	}
	//반환 값이 없을 때는 void 타입 
	private int Add(int a, int b) {

		return a+b;
	}

}

}