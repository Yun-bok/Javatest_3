
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		try {
			int result = safeAdd(2000000000, 2000000);
			System.out.println(result);
		}catch (ArithmeticException e) {
			
		}catch (Exception e) {
			System.out.println("�����÷ο찡 �߻� -> ��Ȯ�Ѱ��x");
		}

	}
	//�Լ� -> ��ɴ��� -> ����� ��ѱ�� ���� ����
	//���������� (static)Ÿ�� �Լ��̸�(�Ű�����Ÿ�� �̸�.....
	//���������� -private(����x) public , protected(Ư����Ȳ���� ����)
	//������ �Ǹ� private�⺻
	//static ->�������
	//**Ÿ�� - ��ȯŸ�� -> �Լ��� �������� ������� Ÿ��
	//*�̸� - �Լ������ ���� ��Ī
	//**�Ű����� Ÿ�� -> ��� ������ �������� ->���� ����
	//**�Ű����� -> �Լ��ȿ��� ����� ������ ���޹ޱ� ���� ���
	
	//����
	//���뼺, ������
	public static int safeAdd(int left,int right) {
		if((right>0)) {
			if(left>Integer.MAX_VALUE - right) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}else {
			if(left<(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}
		System.out.println("test");
		return left + right;
		
	}

}
