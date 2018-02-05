import java.util.*;
public class list_arry {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String a = "A",b = "B",c = "C";
		List<String> list = new LinkedList<String>();
		list.add(a);
		list.add(b);
		list.add(c);
		Iterator<String> fristlterator = list.iterator();
		while(fristlterator.hasNext()) {
			System.out.println(fristlterator.next());
		}
		list.set(0, b);
		Iterator<String> selterator = list.iterator();
		while(selterator.hasNext()) {
			System.out.println(selterator.next());
		}
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("1","apple");
		map.put("2", "pear");
		map.put("3", a);
		System.out.println(map.get("1"));
		
	}

}
