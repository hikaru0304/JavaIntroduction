package first;

public class LedTV implements TV{
	@Override
	public void trunOn() {
		System.out.println("�Ѵ�");
	}
	@Override
	public void trunOff() {
		System.out.println("����");
	}
	@Override
	public void changeVolume(int volume) {
		System.out.println("������ �����ϴ�");
	}
	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("channel�� �����ϴ�.");
	}
	
}
