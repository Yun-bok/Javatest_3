package sec04;

public class ex01 {
	public static void main(String[] args) {
		//���� ������
		//�ǿ����ڰ� 2��
		//���, ���ڿ� ����, ���� ���� , �� , ��, ��Ʈ��, ��Ʈ�̵�
		
		//��� ������ 
		//��Ģ���� �� ������
		//����*,������ /,������%
		//���� : int�� ������ �����ϸ� '��'�� ���´�.
		System.out.println("��� ������");
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
		
		//int int_Val2 = 3/0; //���� ���� -> �������(����)
		
		//������
		//0~b���� 1���� ������
		System.out.println("������ ����");
		int a = 5 , b = 3;
		int c = a%b;
		System.out.println(c);
		
		//����
		// -0, 0.0 ���� �����⳪ �������� ���ϸ� ������ �ƴ�-> ���͸� �ʿ�
		//NaN : Not a Number  3%0.0
		//Infinity            3/0.0
		
		System.out.println(1%0.0);
		System.out.println(1/0.0);
		
		//���ڿ� ������(+)
		//���ڿ� ����
		System.out.println("���ڿ� ������");
		String str = "���ڿ�" + "�̾���̱�+����"+6+"�Ǽ�"+6.0+'a';
		//���ڿ��̾���̱�+����6�Ǽ�6.0a
		System.out.println(str);
		
		//�� ������ (==,!=, <,>,<=,>=)
		System.out.println("�� ������");
		boolean b_Val = 3==4;
		System.out.println("b_Val");
		int i_Val = 3;
		boolean b_Val2 = i_Val!=4;
		System.out.println(b_Val2);
		boolean b_Val3 = "�����" =="�׷���";
		boolean b_Val4 = "��ġ" =="��ġ";
		System.out.println(b_Val3);
		System.out.println(b_Val4);
		
		//�� ������(&&,||,^,!,&,|)
		//�ǿ����ڰ� booleanŸ��
		//AND(����)&&, OR(����)||, XOR(��Ÿ�� ����), NOT(������) !
		//AND�� �Ѵ� �� -> �� , OR�� ���� �ϳ��̻� ��->��
		//XOR�� ���� �ϳ��� ��->��, NOT�� ����
		//&& �ΰ����� ���� �ǿ����ڰ� false�� ���� ������ ��������,
		//& �Ѱ��� ������ �Ѵ� ������ ��
		System.out.println("��������");
		
		
		//��Ʈ ������
		//��Ʈ �� ������(&,|,^,~)�� ��Ʈ �̵� ������(<<,>>,>>>)
		
		//��Ʈ �� ������(&,|,^,~)
		//�ǿ����ڰ� ����Ÿ��
		//�Ϲ� �������ڿ� ����� ����, true, false ��� 1�� 0����
		System.out.println("��Ʈ �� ������");
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
		
		//��Ʈ �̵� ������(<<,>>,>>>)
		//�����̵�<<
		//�º��� �� ��Ʈ�� �캯��ŭ �������� �̵�, ���ڸ��� 0
		System.out.println("��Ʈ �̵� ������");
		int result = 2<<2;
		//00000010
		//00001000 -> 8
		System.out.println(result);
		int result2 = 2<<34; // ? int 32bit <<32 �ڱ��ڸ�
		System.out.println(result2);
		
		//���� �̵�>>
		//�º��� �� ��Ʈ�� �캯��ŭ ���������� �̵�, ���ڸ��� �ֻ����η� ��Ʈ��
		int result3 = -8>>1;
		//1.���� 2������ �����
		//00001000 ->8�� 2����
		//2.~���� -> ������Ű�°�
		//11110111
		//3.+1
		//11111100 -> -8 2����
		//11111100 -> ���� 2���� -> ������
		//1.2.3. �������� 2���� ->��ȣ�� - �ٿ���� 
		//��. -1
		//11111100 -> 11111011
		//��.~���� -> ����
		//00000100 ->
		//��. ��ȣ
		//-4
		
		System.out.println(result3);
		
		//���� �̵� >>>
		//�º��� ����Ʈ�� �캯��ŭ �����������̵�, ���ڸ��� 0���� ä��
		int result4 = -8>>>1;
		//11111000
		// 11111000
		//01111100
		
		//00000000 00000000 00000000 0000100 ->	
		//����
		//11111111 11111111 11111111 11110111
		//+1
		//11111111 11111111 11111111 11111000
		// 11111111 11111111 11111111 11111000
		//011111111 11111111 11111111 1111100 -> ����
		System.out.println(result4);
		
		//���� ������
		//�ܼ� ���� = 
		//���� ���� ������
		//���� ������ ���� ���� ������ ������ (������)=�տ� ������  ������ ��
		//���� ������ ����
		//+=,-=,*=,/=,&=
		System.out.println("���� ������");
		int test = 5;
		test *= 5;// �������� �������� ���ؼ� �־��ش�
		System.out.println(test);
		
	}

}
