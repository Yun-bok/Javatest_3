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
		
		//for ( 1. �ʱⰪ ; 2. ���ǽ� ; 4. ������) {
		//    3.�ݺ��� �ڵ�
		//}
		//1.�ʱⰪ -> � ������ ��� ���� ����
		//2.���ǽ� -> ���̸� �ȿ� �ڵ带 �ݺ��ϰ�, �����̸� ��
		//3.�ݺ��� �ڵ带 ����
		//4.������ -> ���� �ٲ㼭 �ݺ��� ���� ������ ã�� ����°�
		//      �ʱⰪ++ �ʱⰪ--  �ʱⰪ=�ʱⰪ+2
		//2 ���ǽ� üũ -> ������ �Ǵ���
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
	//��ȯ ���� ���� ���� void Ÿ�� 
	private int Add(int a, int b) {

		return a+b;
	}

}

}