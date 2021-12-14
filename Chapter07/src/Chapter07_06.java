import java.util.*;

class Location{
	
	private String latitude;
	private String longitude;
	
	public Location(String la, String longit) {
		this.latitude=la;
		this.longitude=longit;
	}
public String getlatitude() {return latitude;}
public String getlongitude() {return longitude;}


}



public class Chapter07_06 {

	public static void main(String[] args) {
		int count=0;
		String city;
		Location result;
		HashMap<String,Location> map = new HashMap<String,Location>();
		Scanner sc = new Scanner(System.in);
		
		while(count<4) {
			System.out.println("����, �浵, ������ �Է��ϼ���.");
			String imfor = sc.nextLine();
			 String[] a= imfor.split(", ");
			 
			 map.put(a[0], new Location(a[1],a[2]));
			 a=null;
			 count++;
		}
		System.out.println("---------------------------");
		
		Set<String> key= map.keySet();
		Iterator<String> it = key.iterator();
		while(it.hasNext()) {
			city =it.next();
			result = map.get(city);
			System.out.println(city+"  "+result.getlatitude()+"  "+result.getlongitude());
			
		}
		System.out.println("---------------------------");
		
		while(true) {
			System.out.println("���� �̸�?");
			city=sc.next();
			
			if(city.equals("�׸�"))
			break;
			Location a =map.get(city);
			
			if(a==null)
				System.out.println(a+"�� �����ϴ�.");
			else
				System.out.println(city+" "+ a.getlatitude()+" " +a.getlongitude());
			
		}
		


	sc.close();
	}
}
