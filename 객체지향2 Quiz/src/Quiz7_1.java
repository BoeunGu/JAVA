class SutdaDeck{
	final int CARD_NUM=20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];			// SutdaDeck Ŭ�������� �ٸ�Ŭ���� Ÿ���� �迭�� ��� �ü� �ֳ�????????
	
	SutdaDeck() {
		for(int i=0;i<cards.length;i++) {
			cards[i]= new SutdaCard(i%10+1,false);
			if(i==0||i==2||i==7 ) {
				cards[i]= new SutdaCard(i%10+1,true);
			}
		}
		
	}
	
	
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1,true);
		}
	SutdaCard(int num,boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	public String toString() {
		return num + (isKwang? "K":" ")+"ha";
	}
}
public class Quiz7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0;i<deck.cards.length;i++)
			System.out.print(deck.cards[i]+", ");

	}

}
