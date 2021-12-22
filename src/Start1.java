import java.util.Scanner;

//Start1.java
//1.데이터  저장 공간 생성
//2.초기화(대입연산/ 사용자입력)Scanner
//- 데이터 저장공간에 최초로 값을 저장!
//3.연산  초기화된 데이터를 이용해서 결과물
//4.결과 출력
public class Start1 {
	public static Scanner scan = new Scanner(System.in);
	//정수 두개를 입력받고 출력
	/*
	public static void Exam1() {
	//정수1개와 실수 1개를 입력받고 출력
	//실수타입:float
	//입력   :Float.paraInt(문자열);
	public static void Exam3() {
	//정수2 합의 결과 출력
	
		int num3; //변수선업
		int num4;
		int result; //연산결과를 담을 변수
		
		//연산에 참여할 변수 초기화
		System.out.println("정수 입력: ");
		num3 =Integer.parseInt(scan.nextLine());
		
		System.out.println("정수 입력: ");
		num4 =Integer.parseInt(scan.nextLine());

		result = num1 + num2; //연산
		
		//결과출력
		System.out.println(num1 + "+"+num2+"="+result);
		
		
	}	
	*/
	/*
	public static void Exam4()
	{
		float num1;
		float num2;
		float result;
		System.out.println("실수입력 : ");
	num1 = Float.parseFloat(scan.nextLine());
	
		System.out.println("실수입력 : ");
	num2 = Float.parseFloat(scan.nextLine());
		result = num1 + num2;
	System.out.println(num1 + "+"+ num2 + "=" + result);	
		
		
		
		
		
	}
	*/
	public static void Exam5() {
		int num1;
		float num2;
		float result;
	    
	    
	    
	    System.out.println("정수받기 :");
	    num1 = Integer.parseInt(scan.nextLine());
	    System.out.println("실수받기 :");
	    num2 = Float.parseFloat(scan.nextLine());
	    result = num1 * num2;
	 System.out.println(num1 * num2 +"=" + result);
	 
	}
	//사용자로부터 정수1개 실수1개 입력받아 곱의 결과 출력
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Exam5();
	}
}	
	

 	
	
/*
//int num1;
//int num2;
///
System.out.println("정수 입력 : ");

num1 = Integer.parseInt(scan.nextLine());


System.out.println("정수입력 2 : ");

num2 = Integer.parseInt(scan.nextLine());

System.out.println("입력된 정수: " + num1);
System.out.println("입력된 정수2 : " + num2);





int num1;
float num2;


System.out.println("정수 입력:");
num1 = Integer.parseInt(scan.nextLine());

System.out.println("실수 입력:");
num2 = Float.parseFloat(scan.nextLine());

System.out.println("정수값 :" + num1);
System.out.println("실수값 : " + num2);
	*/