import java.util.Vector;

interface IStack<T> {
	T pop();

	boolean push(T ob);
}

class MyStack1<T> implements IStack<T> {
	Vector<T> v = new Vector<T>();

	public boolean push(T ob) {
		v.add(ob);
		return true;
	}

	public T pop() {
		if (v.size() == 0)
			return null;
		T pop = v.get(v.size() - 1);
		v.remove(v.size() - 1);
		return pop;
	}

}
public class Chapter7_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IStack<Integer> stack = new MyStack1<Integer>(); // 오버라이딩? -> 인터페이스의 다형성을 보여주기 위하여
		for (int i = 0; i < 10; i++)
			stack.push(i);

		while (true) {
			Integer n = stack.pop();
			if (n == null)
				break;
			System.out.print(n + "  ");
		}

	}

}
