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
	int pre; // ����ä���� ������ ����
	int temp; // channel�� ��Ƴ��� ����

	// Quiz 11
	public MyTv3() { // ������ ����

	}

	void setChannel(int a) {
		pre = channel; // ����ä�ο� ������ ä���� ����
		channel = a; // a�� ������ ä���� ����
	}

	public int getChannel() {
		return this.channel; // ������ ä���� ���
	}

	public void gotoPrevChannel() {// rotation
		temp = channel; // temp�� ������ channel�� ����
		channel = pre; // ���� channel�� ����ä�ΰ��� ��Ÿ������
		pre = temp; // ����ä���� temp(����ä���� ��)�� ����

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
