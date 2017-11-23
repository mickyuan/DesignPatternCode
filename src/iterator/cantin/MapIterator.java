package iterator.cantin;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapIterator {
	public static void main(String[] args) {

		Map<String,String> map = new HashMap<>();
		map.put("a", "b");
		java.util.Iterator<Entry<String, String>> i = map.entrySet().iterator();
		while(i.hasNext()){
			Entry<String, String> s = i.next();
			System.out.println(s.getKey());
			System.out.println(s.getValue());
		}
	}
}
