package sec4;

public class ex01_1 {

	public static void main(String[] args) {
		int charCode = 'A';// �ڵ� Ÿ�Ժ�ȯ
		
		//if(���ǽ�) ���ǽ��� true -> ��� ����, false ����x
		if( (charCode>=65) & (charCode<=90)) {
			System.out.println("�빮�� �̱���");
		}
		
		if( (charCode>=97) && (charCode>57) ) {
			System.out.println("�ҹ��� �̱���");
		}
		//charCode>=48 && charCode<=57
		if(!(charCode<48) && !(charCode>57) ) {
			System.out.println("0~9 ���� �̱���");
		}
		int value = 6;
		
		if( (value%2==0)  |  (value%3==0)) {
			System.out.println("2 �Ǵ� 3�� ��� �̱���");
		}
		//if( (true�Ѵ� �°Զ�����) || (true))
		//if(true)
		if( (value%2==0) || (value%3==0) ) {
			System.out.println("2�Ǵ� 3�� ��� �̱���");
		}
		

	}

}
