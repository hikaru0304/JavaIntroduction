package first;

public class IfExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 50;
		int y = 60;
		
		if(x<y) {
			System.out.println("x�� y ���� �۽��ϴ�.");
			System.out.println("test");
		}
		if(x<y)
			System.out.println("x�� y�� �����ϴ�.");
		System.out.println("test");
		if(x == y) {
			System.out.println("x�� y�� �����ϴ�.");
			System.out.println("test");
		}else if(x < y) {
			System.out.println("x �� y ���� �۽��ϴ�.");
		}else {
			System.out.println("x�� y�� �ٸ��ϴ�.");
		}
	}

}
