package first;

public class LedTV implements TV{
	@Override
	public void trunOn() {
		System.out.println("켜다");
	}
	@Override
	public void trunOff() {
		System.out.println("끄다");
	}
	@Override
	public void changeVolume(int volume) {
		System.out.println("볼륨을 조정하다");
	}
	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("channel을 저장하다.");
	}
	
}
