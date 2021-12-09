class KStack<T>{
	int tos;
	Object[] stck;
	public KStack() {
		tos=0;
		stck = new Object[10];
	}
	
	public void push(T item) {
		if(tos==10)
			return;
		stck[tos]=item;
		tos++;
	}
	public T pop() {
		if(tos==0)
			return null;
		tos--;
		return (T)stck[tos];
	}
}
public class GenericMethodEx {
	
	public static <T> KStack<T> reverse (KStack<T> a){
		
		KStack<T> s = new KStack<T>();
		
		while(true) {
			T tmp;
			tmp=a.pop();
			if(tmp==null)
				break;
			else
				s.push(tmp);
		}
		return s;
	}

	public static void main(String[] args) {
		KStack<Double> ks = new KStack<Double>();
		
		for(int i=0;i<5;i++) {
			ks.push(new Double(i));
			
		}
ks=reverse(ks);
for(int i=0;i<5;i++) {
	System.out.println(ks.pop());
}
		

	}

}
