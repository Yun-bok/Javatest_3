package sec05;

public class ex01 {

	public static void main(String[] args) {
		//���� ������ 
		//������ �ǿ�����
		//���ǽ� ? A(�� or �����) : B(�� or �����)
		//���ǽ��� ��(true)�̸� A��, ����(false) B���� �޴°Ͱ�
		int hour = 16;
		String result = (hour>=18)?"���":"������";
		System.out.println(result);
		
		if(hour>=18) {
			result = "���";
		}
		else {
			result = "������";
		}
		System.out.println(result);

	}

}
