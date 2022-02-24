package first;

public interface TV {
	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 100;
	
	public void trunOn();
	public void trunOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
}
