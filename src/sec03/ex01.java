package sec03;

public class ex01 {
	public static void main(String[] args) {
		//[���� ������]
		//�ǿ�����(���ͷ�,����)�� 1���� ������
		//��ȣ(+,-) , ����(++,--), �� ����(!), ��Ʈ ����(~)
		
		//��ȣ ������(+,-)
		//���, ���� ǥ���Ҷ� ���
		//��ȣ �����Ҷ��� ���
		System.out.println("��ȣ ������");
		int num = +10;
		int num2 = +num;
		int num3 = -num;
		//���� 
		int num4 = num*(-1);
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		//�����Ͽ���
		//������ ������� int Ÿ������ ��ȯ
		// ���� short x = -(-100L); L = long Ÿ�� �����ϸ� int�� �������� long�� ũ�⿡ �ڵ���ȯ�ȴ�
		// int x2 = -(-100L);
		
		
		//���� ������(++,--)
		//������ ���� 1����(++) or 1����(--)
		//���� �տ� ������ �ٸ� �����ں��� ����
		//���� �ڿ�������  �ٸ� �����ں��� ���߿� �۾���
		
		System.out.println("����������");
		int x = 3, y = 5;
		int temp = x++;
		System.out.println(temp);
		System.out.println(x);
		int temp2 = ++x;
		System.out.println(temp2);
		System.out.println(x);
		//����� ������ �̷������� �Ŀ��� �̷��������� �߿�
		//temp������ x�� 3->4�� �ǰ� ���� �������� 5�� ��µǰԵȴ� �帧����
		//x�� 4�� �������� ����� temp�� �߱⿡ �����ڰ� �����ڿ����־ 3�̳��´�
		
		
		//��Ŭ������ ������Ʈ �ɼ��� �Ǽ��ɼ������� ������
		//���� result�� ����?
		x=3; y=2;
		int result = ++x + y--;
		//4+2
		//result 6  x=4 , y=1
		
		//���� result�� ����?
		x=3; y=2;
		int result2 = --x + x++ + y-- + --y;
		//result2= 2+2+2+1 ��� �ڿ� y�� 0�̵ȴ�
		//x=4, y=0
		// x++,y--�� �ǿ����ڰ��ǰ� ������ y��0�̵ȴ�
		
		
		System.out.println(result2);
		//���� result3�� ����?
		x=5; y=6;
		int result3 = ++x + y-- - x++ + --y;
		//result3 = 6 + 6 - 6 + 4 =10
		//x=7 , y=4
		System.out.println(result3);
		
		//������ ������ (!)
		//true -> false, false -> true ����
		System.out.println("�� ���� ������");
		boolean boolean_Val = false;
		boolean temp_boolean = !boolean_Val;
		System.out.println(boolean_Val); //false
		System.out.println(!boolean_Val);//true
		System.out.println(temp_boolean);//true
		System.out.println(!temp_boolean);//false
		System.out.println(!(!temp_boolean));//true
		
		//��Ʈ ���� ������(~)
		//���� Ÿ�� �ǿ�����(����,���ͷ�)�� ���
		System.out.println("��Ʈ ���� ������");
		byte test = 126;
		String binartString3 = Integer.toBinaryString(test);
		System.out.println(binartString3); //01111110
		int int_temp = ~test; //126 -> �������� �ٲٸ� //01111110
		//01111110
		//10000001
		//�ֻ��� ��ȣ�� 1�̸�
		//10000001 -1
		//10000000 ����
		//01111111 ->127�ε� �ֻ��� ��ȣ�� 1�̾����ϱ� -���پ -127
		System.out.println(int_temp);
		String binartString4 = Integer.toBinaryString(int_temp);
		System.out.println(binartString4);
		//�ڿ� 8�ڸ� ���� 10000001
		
		byte test2 =32;
		//00100000
		int int_temp2 = ~test2;
		//11011111
		//(ù��°) �ֻ����η� 1�̴� -1�ϰ� ������Ų ����� -��ȣ �߰� 1'byte'�ϱ� 8�ڸ�
		//11011110
		//00100001 �ڿ�1�������ϱ� 33 -> -33 �ڿ������� 1 2������ 1 2 4 8 16��
		System.out.println(int_temp2);
		
		
	}
}
