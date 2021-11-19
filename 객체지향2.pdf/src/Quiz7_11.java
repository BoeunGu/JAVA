//			Boeun Gu
//			latest edit: 18/11/21
class MyTv3 {
	private boolean isPowerOn;
	private int channel;
	private int volume;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	int pre; // 이전채널을 지시할 변수
	int temp; // channel을 담아놓을 공간

	// Quiz 11
	public MyTv3() { // 생성자 만듬

	}

	void setChannel(int a) {
		pre = channel; // 이전채널에 현재의 채널을 저장
		channel = a; // a의 값으로 채널을 설정
	}

	public int getChannel() {
		return this.channel; // 현재의 채널을 출력
	}

	public void gotoPrevChannel() {// rotation
		temp = channel; // temp에 현재의 channel값 저장
		channel = pre; // 현재 channel에 이전채널값을 나타나게함
		pre = temp; // 이전채널은 temp(현재채널의 값)을 저장

	}

}

public class Quiz7_11 {

	public static void main(String[] args) {
		MyTv3 t = new MyTv3();

		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH: " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH: " + t.getChannel());

	}

}
