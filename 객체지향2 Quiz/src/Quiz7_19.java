//			Boeun Gu
//			latest edit: 22/11/21
class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;

	void buy(Product p) {
		if (p.price > money)
			System.out.println("your money is not enough");

		money = money - p.price;
		add(p);
	}

	void add(Product p) {
		if (i > cart.length-1) {
			Product[] cart2 = new Product[cart.length *2];
			for (int j = 0; j < cart.length; j++) {
				cart2[j] = cart[j];
				cart = cart2;
			}
		}
			cart[i] = p;
			i++;
		}

	

	void summary() {
		for (int i = 0; i < cart.length; i++) {
			System.out.print(cart[i] + ",");
		}
		System.out.println(" ");
		System.out.println("사용한 금액 " + money);
		System.out.println("남음 금액 " + (1000 - money));

	}

}

class Product {
	int price;

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";

	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

public class Quiz7_19 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());

		b.summary();

	}
}

	
