package first;

public class ExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 5;
		
		try {
			int k = i/j;
			System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다."+e.toString());
		}
		System.out.println("main end!!!");
	}

}
