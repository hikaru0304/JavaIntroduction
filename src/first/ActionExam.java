package first;

public class ActionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Action action = new MyAction();
//		action.exec();
		Action action = new Action() {
			@Override
			public void exec() {
				System.out.println("exec");
			}
		};
		action.exec();
		
	}

}
