import java.util.Scanner;

//Start1.java
//1.������  ���� ���� ����
//2.�ʱ�ȭ(���Կ���/ ������Է�)Scanner
//- ������ ��������� ���ʷ� ���� ����!
//3.����  �ʱ�ȭ�� �����͸� �̿��ؼ� �����
//4.��� ���
public class Start1 {
	public static Scanner scan = new Scanner(System.in);
	//���� �ΰ��� �Է¹ް� ���
	/*
	public static void Exam1() {
	//����1���� �Ǽ� 1���� �Է¹ް� ���
	//�Ǽ�Ÿ��:float
	//�Է�   :Float.paraInt(���ڿ�);
	public static void Exam3() {
	//����2 ���� ��� ���
	
		int num3; //��������
		int num4;
		int result; //�������� ���� ����
		
		//���꿡 ������ ���� �ʱ�ȭ
		System.out.println("���� �Է�: ");
		num3 =Integer.parseInt(scan.nextLine());
		
		System.out.println("���� �Է�: ");
		num4 =Integer.parseInt(scan.nextLine());

		result = num1 + num2; //����
		
		//������
		System.out.println(num1 + "+"+num2+"="+result);
		
		
	}	
	*/
	/*
	public static void Exam4()
	{
		float num1;
		float num2;
		float result;
		System.out.println("�Ǽ��Է� : ");
	num1 = Float.parseFloat(scan.nextLine());
	
		System.out.println("�Ǽ��Է� : ");
	num2 = Float.parseFloat(scan.nextLine());
		result = num1 + num2;
	System.out.println(num1 + "+"+ num2 + "=" + result);	
		
		
		
		
		
	}
	*/
	public static void Exam5() {
		int num1;
		float num2;
		float result;
	    
	    
	    
	    System.out.println("�����ޱ� :");
	    num1 = Integer.parseInt(scan.nextLine());
	    System.out.println("�Ǽ��ޱ� :");
	    num2 = Float.parseFloat(scan.nextLine());
	    result = num1 * num2;
	 System.out.println(num1 * num2 +"=" + result);
	 
	}
	//����ڷκ��� ����1�� �Ǽ�1�� �Է¹޾� ���� ��� ���
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Exam5();
	}
}	
	

 	
	
/*
//int num1;
//int num2;
///
System.out.println("���� �Է� : ");

num1 = Integer.parseInt(scan.nextLine());


System.out.println("�����Է� 2 : ");

num2 = Integer.parseInt(scan.nextLine());

System.out.println("�Էµ� ����: " + num1);
System.out.println("�Էµ� ����2 : " + num2);





int num1;
float num2;


System.out.println("���� �Է�:");
num1 = Integer.parseInt(scan.nextLine());

System.out.println("�Ǽ� �Է�:");
num2 = Float.parseFloat(scan.nextLine());

System.out.println("������ :" + num1);
System.out.println("�Ǽ��� : " + num2);
	*/