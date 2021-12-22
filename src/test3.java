
public class test3 {

	public static void main(String[] args) {
		
	}	
		//Add,Sub,Mul,Div ???
				
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
