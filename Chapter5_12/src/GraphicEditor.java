import java.util.Scanner;

public class GraphicEditor {
	private String name;
	private Shape start = null, last = null; // Shape Type Upcasting, for using subclass(Line,Rect,Circle)
	private Scanner sc = new Scanner(System.in);

	public GraphicEditor(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("그래픽 에디터 "+name+"를 실행합니다.");
		int choice=0;		//삽입,삭제,,,
		int num=0;			//도형 모양 고리는 번호
		
		while(choice!=4) {		//"4가 아니면'
			System.out.println("삽입(1), 삭제(2), 모두보기(3), 종료(4)");
			choice = sc.nextInt();
				
			
			switch(choice) {
			case 1:
				//insert()
				System.out.print("Line(1), Rect(2), Circle(3) :");
				num=sc.nextInt();
				if(num<1 || num>3) {
					System.out.println("잘못입력");
					break;
				}
				insert(num);
				break;
			case 2:
				//delete()
				System.out.println("삭제할 도형 위치입력");
				num= sc.nextInt();
				
				if(!delete(num)) {			//false일 경우 
					System.out.println("삭제할 수 없음.");
				}
				break;
				
				
			case 3:
				//show()
				Shape t= start;
				while(t != null) {
					t.draw();
					t=t.getNext();
				}
				break;
			case 4:
				System.out.println(name+" 를 종료합니다.");
				break;
			default:
				System.out.println("1~4까지 입력가능");
			}
			
		}
		
	}
	
	private void insert(int num) {
		Shape obj =null;
		
		switch(num) {
		case 1:
			obj = new Line();
			break;
		case 2:
			obj = new Rect();
			break;
		case 3:
			obj = new Circle();
			break;
		}
		if(start==null) {
			start = last=obj;
			}
		else {
			last.setNext(obj);
			last=obj;
		}
	}
	
	private boolean delete(int num) {
		Shape cur=start;		//cur은 삭제하고자 하는 위치를 나타내는 레퍼런스 변수 
		Shape pre=start;
		if(start == null) return false;
		for(int i=0;i<num;i++) {
			pre=cur;
			cur=cur.getNext();
			if(cur==null) {
				return false;
			}
		}
		if(start==last) {
			start=last=null;
			return true;
		}
		if(cur==start) {
			start=start.getNext();
		}
		else if (cur==last) {
			last=pre;
			last.setNext(null);
		}
		else {
			pre.setNext(cur.getNext());
		}return true;
	}

	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor("beauty");
		ge.run();

	}

}
