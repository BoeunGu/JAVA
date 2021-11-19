//			Boeun Gu
//			latest edit: 18/11/21
class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	//Quiz (10-11)
	void setChannel(int a){
		this.channel=a;
	}
	void setVolume(int a) {
		this.volume=a;
	}

	public int getChannel() {
		return this.channel;
	}
	public int getVolume() {
		return this.volume;
	}
	
	
}
public class Quiz7_10 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());

	}

}
